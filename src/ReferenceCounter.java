import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import cef.cef_base_t;
import cef.cef_base_t.add_ref_callback;
import cef.cef_base_t.has_one_ref_callback;
import cef.cef_base_t.release_callback;

/**
 * Performs reference counting on some Java objects. Holds a reference
 * to those objects until the reference count on those objects goes
 * to zero.
 */
public class ReferenceCounter
{
   Object ref;
   int count;
   
   public ReferenceCounter(Object obj)
   {
      this.ref = obj;
      count = 0;
   }
   
   static Map<Long, ReferenceCounter> counters = new HashMap<>();
   
   public static <U extends Structure> U create(Class<U> baseClass) 
   {
      try
      {
         Structure s = Structure.newInstance(baseClass);
         Pointer p = s.getPointer();
         Field baseField = s.getClass().getField("base");
         cef_base_t base = new cef_base_t(p); 
         baseField.set(s, base);
         base.size = s.size();
         base.add_ref = add_ref;
         base.has_one_ref = has_one_ref;
         base.release = release;
         ReferenceCounter refCounted = new ReferenceCounter(base);
         synchronized(referenceLock)
         {
            counters.put(Pointer.nativeValue(s.getPointer()), refCounted);
         }
         return (U)s;
      } catch (IllegalAccessException | NoSuchFieldException | SecurityException e)
      {
         throw new IllegalArgumentException(e);
      }
   }

   static Object referenceLock = new Object();
   
   static add_ref_callback add_ref = new add_ref_callback() {
      @Override public void apply(cef_base_t self)
      {
         synchronized(referenceLock)
         {
            ReferenceCounter refCount = counters.get(Pointer.nativeValue(self.getPointer())); 
            refCount.count++;
         }
      }
   };
   static has_one_ref_callback has_one_ref = new has_one_ref_callback() {
      @Override public int apply(cef_base_t self)
      {
         synchronized(referenceLock)
         {
            return counters.get(Pointer.nativeValue(self.getPointer())).count > 0 ? 1 : 0;
         }
      }
   };
   static release_callback release = new release_callback() {
      @Override public int apply(cef_base_t self)
      {
         synchronized(referenceLock)
         {
            ReferenceCounter refCount = counters.get(Pointer.nativeValue(self.getPointer())); 
            refCount.count--;
            if (refCount.count <= 0)
            {
               counters.remove(self);
            }
            return refCount.count > 0 ? 1 : 0;
         }
      }
   };
}
