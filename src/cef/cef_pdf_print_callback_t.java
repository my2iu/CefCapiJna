package cef;
import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : include\capi\cef_browser_capi.h:62</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class cef_pdf_print_callback_t extends Structure {
	/** C type : cef_base_t */
	public cef_base_t base;
	/** C type : on_pdf_print_finished_callback* */
	public cef_pdf_print_callback_t.on_pdf_print_finished_callback on_pdf_print_finished;
	/** <i>native declaration : include\capi\cef_browser_capi.h:61</i> */
	public interface on_pdf_print_finished_callback extends Callback {
		void apply(cef_pdf_print_callback_t self, cef_string_utf16_t path, int ok);
	};
	public cef_pdf_print_callback_t() {
		super();
	}
	protected List <String> getFieldOrder() {
		return Arrays.asList("base", "on_pdf_print_finished");
	}
	/**
	 * @param base C type : cef_base_t<br>
	 * @param on_pdf_print_finished C type : on_pdf_print_finished_callback*
	 */
	public cef_pdf_print_callback_t(cef_base_t base, cef_pdf_print_callback_t.on_pdf_print_finished_callback on_pdf_print_finished) {
		super();
		this.base = base;
		this.on_pdf_print_finished = on_pdf_print_finished;
	}
	public cef_pdf_print_callback_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends cef_pdf_print_callback_t implements Structure.ByReference {
		
	};
	public static class ByValue extends cef_pdf_print_callback_t implements Structure.ByValue {
		
	};
}