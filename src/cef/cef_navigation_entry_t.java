package cef;
import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : include\capi\cef_navigation_entry_capi.h:27</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class cef_navigation_entry_t extends Structure {
	/** C type : cef_base_t */
	public cef_base_t base;
	/** C type : is_valid_callback* */
	public cef.cef_download_item_t.is_valid_callback is_valid;
	/** C type : has_post_data_callback* */
	public cef_navigation_entry_t.has_post_data_callback has_post_data;
	/** C type : get_http_status_code_callback* */
	public cef_navigation_entry_t.get_http_status_code_callback get_http_status_code;
	/** <i>native declaration : include\capi\cef_navigation_entry_capi.h:18</i> */
	public interface is_valid_callback extends Callback {
		int apply(cef_navigation_entry_t self);
	};
	/** <i>native declaration : include\capi\cef_navigation_entry_capi.h:19</i> */
	public interface cef_string_userfree_t_callback extends Callback {
		int apply(cef_navigation_entry_t self);
	};
	/** <i>native declaration : include\capi\cef_navigation_entry_capi.h:20</i> */
	public interface cef_string_userfree_t_callback2 extends Callback {
		int apply(cef_navigation_entry_t self);
	};
	/** <i>native declaration : include\capi\cef_navigation_entry_capi.h:21</i> */
	public interface cef_string_userfree_t_callback3 extends Callback {
		int apply(cef_navigation_entry_t self);
	};
	/** <i>native declaration : include\capi\cef_navigation_entry_capi.h:22</i> */
	public interface cef_string_userfree_t_callback4 extends Callback {
		int apply(cef_navigation_entry_t self);
	};
	/** <i>native declaration : include\capi\cef_navigation_entry_capi.h:23</i> */
	public interface cef_transition_type_t_callback extends Callback {
		int apply(cef_navigation_entry_t self);
	};
	/** <i>native declaration : include\capi\cef_navigation_entry_capi.h:24</i> */
	public interface has_post_data_callback extends Callback {
		int apply(cef_navigation_entry_t self);
	};
	/** <i>native declaration : include\capi\cef_navigation_entry_capi.h:25</i> */
	public interface cef_time_t_callback extends Callback {
		int apply(cef_navigation_entry_t self);
	};
	/** <i>native declaration : include\capi\cef_navigation_entry_capi.h:26</i> */
	public interface get_http_status_code_callback extends Callback {
		int apply(cef_navigation_entry_t self);
	};
	public cef_navigation_entry_t() {
		super();
	}
	protected List <String> getFieldOrder() {
		return Arrays.asList("base", "is_valid", "has_post_data", "get_http_status_code");
	}
	/**
	 * @param base C type : cef_base_t<br>
	 * @param is_valid C type : is_valid_callback*<br>
	 * @param has_post_data C type : has_post_data_callback*<br>
	 * @param get_http_status_code C type : get_http_status_code_callback*
	 */
	public cef_navigation_entry_t(cef_base_t base, cef.cef_download_item_t.is_valid_callback is_valid, cef_navigation_entry_t.has_post_data_callback has_post_data, cef_navigation_entry_t.get_http_status_code_callback get_http_status_code) {
		super();
		this.base = base;
		this.is_valid = is_valid;
		this.has_post_data = has_post_data;
		this.get_http_status_code = get_http_status_code;
	}
	public cef_navigation_entry_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends cef_navigation_entry_t implements Structure.ByReference {
		
	};
	public static class ByValue extends cef_navigation_entry_t implements Structure.ByValue {
		
	};
}
