package cef;
import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : include\capi\cef_string_visitor_capi.h:5</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class cef_string_visitor_t extends Structure {
	/** C type : cef_base_t */
	public cef_base_t base;
	/** C type : visit_callback* */
	public cef.cef_navigation_entry_visitor_t.visit_callback visit;
	/** <i>native declaration : include\capi\cef_string_visitor_capi.h:4</i> */
	public interface visit_callback extends Callback {
		void apply(cef_string_visitor_t self, cef_string_utf16_t string);
	};
	public cef_string_visitor_t() {
		super();
	}
	protected List <String> getFieldOrder() {
		return Arrays.asList("base", "visit");
	}
	/**
	 * @param base C type : cef_base_t<br>
	 * @param visit C type : visit_callback*
	 */
	public cef_string_visitor_t(cef_base_t base, cef.cef_navigation_entry_visitor_t.visit_callback visit) {
		super();
		this.base = base;
		this.visit = visit;
	}
	public cef_string_visitor_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends cef_string_visitor_t implements Structure.ByReference {
		
	};
	public static class ByValue extends cef_string_visitor_t implements Structure.ByValue {
		
	};
}