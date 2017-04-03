package cef;
import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : include\internal\cef_string_types.h:13</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class cef_string_utf8_t extends Structure {
	/** C type : char* */
	public Pointer str;
	public int length;
	/** C type : dtor_callback* */
	public cef.cef_string_utf16_t.dtor_callback dtor;
	/** <i>native declaration : include\internal\cef_string_types.h:12</i> */
	public interface dtor_callback extends Callback {
		void apply(Pointer str);
	};
	public cef_string_utf8_t() {
		super();
	}
	protected List <String> getFieldOrder() {
		return Arrays.asList("str", "length", "dtor");
	}
	/**
	 * @param str C type : char*<br>
	 * @param dtor C type : dtor_callback*
	 */
	public cef_string_utf8_t(Pointer str, int length, cef.cef_string_utf16_t.dtor_callback dtor) {
		super();
		this.str = str;
		this.length = length;
		this.dtor = dtor;
	}
	public cef_string_utf8_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends cef_string_utf8_t implements Structure.ByReference {
		
	};
	public static class ByValue extends cef_string_utf8_t implements Structure.ByValue {
		
	};
}