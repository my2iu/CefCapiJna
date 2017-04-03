package cef;
import cef.CefLibrary._cef_command_line_t;
import cef.CefLibrary._cef_list_value_t;
import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : include\capi\cef_browser_process_handler_capi.h:11</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class cef_browser_process_handler_t extends Structure {
	/** C type : cef_base_t */
	public cef_base_t base;
	/** C type : on_context_initialized_callback* */
	public cef_browser_process_handler_t.on_context_initialized_callback on_context_initialized;
	/** C type : on_before_child_process_launch_callback* */
	public cef_browser_process_handler_t.on_before_child_process_launch_callback on_before_child_process_launch;
	/** C type : on_render_process_thread_created_callback* */
	public cef_browser_process_handler_t.on_render_process_thread_created_callback on_render_process_thread_created;
	/** C type : get_print_handler_callback* */
	public cef_browser_process_handler_t.get_print_handler_callback get_print_handler;
	/** <i>native declaration : include\capi\cef_browser_process_handler_capi.h:7</i> */
	public interface on_context_initialized_callback extends Callback {
		void apply(cef_browser_process_handler_t self);
	};
	/** <i>native declaration : include\capi\cef_browser_process_handler_capi.h:8</i> */
	public interface on_before_child_process_launch_callback extends Callback {
		void apply(cef_browser_process_handler_t self, _cef_command_line_t command_line);
	};
	/** <i>native declaration : include\capi\cef_browser_process_handler_capi.h:9</i> */
	public interface on_render_process_thread_created_callback extends Callback {
		void apply(cef_browser_process_handler_t self, _cef_list_value_t extra_info);
	};
	/** <i>native declaration : include\capi\cef_browser_process_handler_capi.h:10</i> */
	public interface get_print_handler_callback extends Callback {
		cef_print_handler_t apply(cef_browser_process_handler_t self);
	};
	public cef_browser_process_handler_t() {
		super();
	}
	protected List <String> getFieldOrder() {
		return Arrays.asList("base", "on_context_initialized", "on_before_child_process_launch", "on_render_process_thread_created", "get_print_handler");
	}
	/**
	 * @param base C type : cef_base_t<br>
	 * @param on_context_initialized C type : on_context_initialized_callback*<br>
	 * @param on_before_child_process_launch C type : on_before_child_process_launch_callback*<br>
	 * @param on_render_process_thread_created C type : on_render_process_thread_created_callback*<br>
	 * @param get_print_handler C type : get_print_handler_callback*
	 */
	public cef_browser_process_handler_t(cef_base_t base, cef_browser_process_handler_t.on_context_initialized_callback on_context_initialized, cef_browser_process_handler_t.on_before_child_process_launch_callback on_before_child_process_launch, cef_browser_process_handler_t.on_render_process_thread_created_callback on_render_process_thread_created, cef_browser_process_handler_t.get_print_handler_callback get_print_handler) {
		super();
		this.base = base;
		this.on_context_initialized = on_context_initialized;
		this.on_before_child_process_launch = on_before_child_process_launch;
		this.on_render_process_thread_created = on_render_process_thread_created;
		this.get_print_handler = get_print_handler;
	}
	public cef_browser_process_handler_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends cef_browser_process_handler_t implements Structure.ByReference {
		
	};
	public static class ByValue extends cef_browser_process_handler_t implements Structure.ByValue {
		
	};
}
