package cef;
import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : include\capi\cef_download_handler_capi.h:5</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class cef_before_download_callback_t extends Structure {
	/** C type : cef_base_t */
	public cef_base_t base;
	/** C type : cont_callback* */
	public cef.cef_request_callback_t.cont_callback cont;
	/** <i>native declaration : include\capi\cef_download_handler_capi.h:4</i> */
	public interface cont_callback extends Callback {
		void apply(cef_before_download_callback_t self, cef_string_utf16_t download_path, int show_dialog);
	};
	public cef_before_download_callback_t() {
		super();
	}
	protected List <String> getFieldOrder() {
		return Arrays.asList("base", "cont");
	}
	/**
	 * @param base C type : cef_base_t<br>
	 * @param cont C type : cont_callback*
	 */
	public cef_before_download_callback_t(cef_base_t base, cef.cef_request_callback_t.cont_callback cont) {
		super();
		this.base = base;
		this.cont = cont;
	}
	public cef_before_download_callback_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends cef_before_download_callback_t implements Structure.ByReference {
		
	};
	public static class ByValue extends cef_before_download_callback_t implements Structure.ByValue {
		
	};
}
