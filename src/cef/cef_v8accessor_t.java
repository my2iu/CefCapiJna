package cef;
import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.PointerByReference;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : include\capi\cef_v8_capi.h:43</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class cef_v8accessor_t extends Structure {
	/** C type : cef_base_t */
	public cef_base_t base;
	/** C type : get_callback* */
	public cef_v8accessor_t.get_callback get;
	/** C type : set_callback* */
	public cef_v8accessor_t.set_callback set;
	/** <i>native declaration : include\capi\cef_v8_capi.h:41</i> */
	public interface get_callback extends Callback {
		int apply(cef_v8accessor_t self, cef_string_utf16_t name, cef_v8value_t object, PointerByReference retval, cef_string_utf16_t exception);
	};
	/** <i>native declaration : include\capi\cef_v8_capi.h:42</i> */
	public interface set_callback extends Callback {
		int apply(cef_v8accessor_t self, cef_string_utf16_t name, cef_v8value_t object, cef_v8value_t value, cef_string_utf16_t exception);
	};
	public cef_v8accessor_t() {
		super();
	}
	protected List <String> getFieldOrder() {
		return Arrays.asList("base", "get", "set");
	}
	/**
	 * @param base C type : cef_base_t<br>
	 * @param get C type : get_callback*<br>
	 * @param set C type : set_callback*
	 */
	public cef_v8accessor_t(cef_base_t base, cef_v8accessor_t.get_callback get, cef_v8accessor_t.set_callback set) {
		super();
		this.base = base;
		this.get = get;
		this.set = set;
	}
	public cef_v8accessor_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends cef_v8accessor_t implements Structure.ByReference {
		
	};
	public static class ByValue extends cef_v8accessor_t implements Structure.ByValue {
		
	};
}
