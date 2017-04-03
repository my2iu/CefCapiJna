package cef;
import cef.CefLibrary._cef_frame_t;
import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.PointerByReference;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : include\capi\cef_v8_capi.h:25</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class cef_v8context_t extends Structure {
	/** C type : cef_base_t */
	public cef_base_t base;
	/** C type : get_task_runner_callback* */
	public cef_v8context_t.get_task_runner_callback get_task_runner;
	/** C type : is_valid_callback* */
	public cef.cef_download_item_t.is_valid_callback is_valid;
	/** C type : get_browser_callback* */
	public cef_v8context_t.get_browser_callback get_browser;
	/** C type : get_frame_callback* */
	public cef.cef_v8stack_trace_t.get_frame_callback get_frame;
	/** C type : get_global_callback* */
	public cef_v8context_t.get_global_callback get_global;
	/** C type : enter_callback* */
	public cef_v8context_t.enter_callback enter;
	/** C type : exit_callback* */
	public cef_v8context_t.exit_callback exit;
	/** C type : is_same_callback* */
	public cef_v8value_t.is_same_callback is_same;
	/** C type : eval_callback* */
	public cef_v8context_t.eval_callback eval;
	/** <i>native declaration : include\capi\cef_v8_capi.h:16</i> */
	public interface get_task_runner_callback extends Callback {
		cef_task_runner_t apply(cef_v8context_t self);
	};
	/** <i>native declaration : include\capi\cef_v8_capi.h:17</i> */
	public interface is_valid_callback extends Callback {
		int apply(cef_v8context_t self);
	};
	/** <i>native declaration : include\capi\cef_v8_capi.h:18</i> */
	public interface get_browser_callback extends Callback {
		cef_browser_t apply(cef_v8context_t self);
	};
	/** <i>native declaration : include\capi\cef_v8_capi.h:19</i> */
	public interface get_frame_callback extends Callback {
		_cef_frame_t apply(cef_v8context_t self);
	};
	/** <i>native declaration : include\capi\cef_v8_capi.h:20</i> */
	public interface get_global_callback extends Callback {
		cef_v8value_t apply(cef_v8context_t self);
	};
	/** <i>native declaration : include\capi\cef_v8_capi.h:21</i> */
	public interface enter_callback extends Callback {
		int apply(cef_v8context_t self);
	};
	/** <i>native declaration : include\capi\cef_v8_capi.h:22</i> */
	public interface exit_callback extends Callback {
		int apply(cef_v8context_t self);
	};
	/** <i>native declaration : include\capi\cef_v8_capi.h:23</i> */
	public interface is_same_callback extends Callback {
		int apply(cef_v8context_t self, cef_v8context_t that);
	};
	/** <i>native declaration : include\capi\cef_v8_capi.h:24</i> */
	public interface eval_callback extends Callback {
		int apply(cef_v8context_t self, cef_string_utf16_t code, PointerByReference retval, PointerByReference exception);
	};
	public cef_v8context_t() {
		super();
	}
	protected List <String> getFieldOrder() {
		return Arrays.asList("base", "get_task_runner", "is_valid", "get_browser", "get_frame", "get_global", "enter", "exit", "is_same", "eval");
	}
	public cef_v8context_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends cef_v8context_t implements Structure.ByReference {
		
	};
	public static class ByValue extends cef_v8context_t implements Structure.ByValue {
		
	};
}
