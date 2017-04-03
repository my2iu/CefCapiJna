package cef;
import cef.CefLibrary.MSG;
import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.IntByReference;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : include\capi\cef_keyboard_handler_capi.h:7</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class cef_keyboard_handler_t extends Structure {
	/** C type : cef_base_t */
	public cef_base_t base;
	/** C type : on_pre_key_event_callback* */
	public cef_keyboard_handler_t.on_pre_key_event_callback on_pre_key_event;
	/** C type : on_key_event_callback* */
	public cef_keyboard_handler_t.on_key_event_callback on_key_event;
	/** <i>native declaration : include\capi\cef_keyboard_handler_capi.h:5</i> */
	public interface on_pre_key_event_callback extends Callback {
		int apply(cef_keyboard_handler_t self, cef_browser_t browser, cef_key_event_t event, MSG os_event, IntByReference is_keyboard_shortcut);
	};
	/** <i>native declaration : include\capi\cef_keyboard_handler_capi.h:6</i> */
	public interface on_key_event_callback extends Callback {
		int apply(cef_keyboard_handler_t self, cef_browser_t browser, cef_key_event_t event, MSG os_event);
	};
	public cef_keyboard_handler_t() {
		super();
	}
	protected List <String> getFieldOrder() {
		return Arrays.asList("base", "on_pre_key_event", "on_key_event");
	}
	/**
	 * @param base C type : cef_base_t<br>
	 * @param on_pre_key_event C type : on_pre_key_event_callback*<br>
	 * @param on_key_event C type : on_key_event_callback*
	 */
	public cef_keyboard_handler_t(cef_base_t base, cef_keyboard_handler_t.on_pre_key_event_callback on_pre_key_event, cef_keyboard_handler_t.on_key_event_callback on_key_event) {
		super();
		this.base = base;
		this.on_pre_key_event = on_pre_key_event;
		this.on_key_event = on_key_event;
	}
	public cef_keyboard_handler_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends cef_keyboard_handler_t implements Structure.ByReference {
		
	};
	public static class ByValue extends cef_keyboard_handler_t implements Structure.ByValue {
		
	};
}
