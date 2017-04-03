package cef;
import cef.CefLibrary._cef_frame_t;
import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : include\capi\cef_life_span_handler_capi.h:12</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class cef_life_span_handler_t extends Structure {
	/** C type : cef_base_t */
	public cef_base_t base;
	/** C type : on_before_popup_callback* */
	public cef_life_span_handler_t.on_before_popup_callback on_before_popup;
	/** C type : on_after_created_callback* */
	public cef_life_span_handler_t.on_after_created_callback on_after_created;
	/** C type : do_close_callback* */
	public cef_life_span_handler_t.do_close_callback do_close;
	/** C type : on_before_close_callback* */
	public cef_life_span_handler_t.on_before_close_callback on_before_close;
	/** <i>native declaration : include\capi\cef_life_span_handler_capi.h:8</i> */
	public interface on_before_popup_callback extends Callback {
		int apply(cef_life_span_handler_t self, cef_browser_t browser, _cef_frame_t frame, cef_string_utf16_t target_url, cef_string_utf16_t target_frame_name, int target_disposition, int user_gesture, cef_popup_features_t popupFeatures, cef_window_info_t windowInfo, PointerByReference client, cef_browser_settings_t settings, IntByReference no_javascript_access);
	};
	/** <i>native declaration : include\capi\cef_life_span_handler_capi.h:9</i> */
	public interface on_after_created_callback extends Callback {
		void apply(cef_life_span_handler_t self, cef_browser_t browser);
	};
	/** <i>native declaration : include\capi\cef_life_span_handler_capi.h:10</i> */
	public interface do_close_callback extends Callback {
		int apply(cef_life_span_handler_t self, cef_browser_t browser);
	};
	/** <i>native declaration : include\capi\cef_life_span_handler_capi.h:11</i> */
	public interface on_before_close_callback extends Callback {
		void apply(cef_life_span_handler_t self, cef_browser_t browser);
	};
	public cef_life_span_handler_t() {
		super();
	}
	protected List <String> getFieldOrder() {
		return Arrays.asList("base", "on_before_popup", "on_after_created", "do_close", "on_before_close");
	}
	/**
	 * @param base C type : cef_base_t<br>
	 * @param on_before_popup C type : on_before_popup_callback*<br>
	 * @param on_after_created C type : on_after_created_callback*<br>
	 * @param do_close C type : do_close_callback*<br>
	 * @param on_before_close C type : on_before_close_callback*
	 */
	public cef_life_span_handler_t(cef_base_t base, cef_life_span_handler_t.on_before_popup_callback on_before_popup, cef_life_span_handler_t.on_after_created_callback on_after_created, cef_life_span_handler_t.do_close_callback do_close, cef_life_span_handler_t.on_before_close_callback on_before_close) {
		super();
		this.base = base;
		this.on_before_popup = on_before_popup;
		this.on_after_created = on_after_created;
		this.do_close = do_close;
		this.on_before_close = on_before_close;
	}
	public cef_life_span_handler_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends cef_life_span_handler_t implements Structure.ByReference {
		
	};
	public static class ByValue extends cef_life_span_handler_t implements Structure.ByValue {
		
	};
}