package cef;
import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : include\capi\cef_response_capi.h:31</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class cef_response_t extends Structure {
	/** C type : cef_base_t */
	public cef_base_t base;
	/** C type : is_read_only_callback* */
	public cef_response_t.is_read_only_callback is_read_only;
	/** C type : set_error_callback* */
	public cef_response_t.set_error_callback set_error;
	/** C type : get_status_callback* */
	public cef_response_t.get_status_callback get_status;
	/** C type : set_status_callback* */
	public cef_response_t.set_status_callback set_status;
	/** C type : set_status_text_callback* */
	public cef_response_t.set_status_text_callback set_status_text;
	/** C type : set_mime_type_callback* */
	public cef_response_t.set_mime_type_callback set_mime_type;
	/** C type : get_header_map_callback* */
	public cef_response_t.get_header_map_callback get_header_map;
	/** C type : set_header_map_callback* */
	public cef_response_t.set_header_map_callback set_header_map;
	/** <i>native declaration : include\capi\cef_response_capi.h:19</i> */
	public interface is_read_only_callback extends Callback {
		int apply(cef_response_t self);
	};
	/** <i>native declaration : include\capi\cef_response_capi.h:20</i> */
	public interface cef_errorcode_t_callback extends Callback {
		int apply(cef_response_t self);
	};
	/** <i>native declaration : include\capi\cef_response_capi.h:21</i> */
	public interface set_error_callback extends Callback {
		void apply(cef_response_t self, int error);
	};
	/** <i>native declaration : include\capi\cef_response_capi.h:22</i> */
	public interface get_status_callback extends Callback {
		int apply(cef_response_t self);
	};
	/** <i>native declaration : include\capi\cef_response_capi.h:23</i> */
	public interface set_status_callback extends Callback {
		void apply(cef_response_t self, int status);
	};
	/** <i>native declaration : include\capi\cef_response_capi.h:24</i> */
	public interface cef_string_userfree_t_callback extends Callback {
		int apply(cef_response_t self);
	};
	/** <i>native declaration : include\capi\cef_response_capi.h:25</i> */
	public interface set_status_text_callback extends Callback {
		void apply(cef_response_t self, cef_string_utf16_t statusText);
	};
	/** <i>native declaration : include\capi\cef_response_capi.h:26</i> */
	public interface cef_string_userfree_t_callback2 extends Callback {
		int apply(cef_response_t self);
	};
	/** <i>native declaration : include\capi\cef_response_capi.h:27</i> */
	public interface set_mime_type_callback extends Callback {
		void apply(cef_response_t self, cef_string_utf16_t mimeType);
	};
	/** <i>native declaration : include\capi\cef_response_capi.h:28</i> */
	public interface cef_string_userfree_t_callback3 extends Callback {
		int apply(cef_response_t self, cef_string_utf16_t name);
	};
	/** <i>native declaration : include\capi\cef_response_capi.h:29</i> */
	public interface get_header_map_callback extends Callback {
		void apply(cef_response_t self, Pointer headerMap);
	};
	/** <i>native declaration : include\capi\cef_response_capi.h:30</i> */
	public interface set_header_map_callback extends Callback {
		void apply(cef_response_t self, Pointer headerMap);
	};
	public cef_response_t() {
		super();
	}
	protected List <String> getFieldOrder() {
		return Arrays.asList("base", "is_read_only", "set_error", "get_status", "set_status", "set_status_text", "set_mime_type", "get_header_map", "set_header_map");
	}
	/**
	 * @param base C type : cef_base_t<br>
	 * @param is_read_only C type : is_read_only_callback*<br>
	 * @param set_error C type : set_error_callback*<br>
	 * @param get_status C type : get_status_callback*<br>
	 * @param set_status C type : set_status_callback*<br>
	 * @param set_status_text C type : set_status_text_callback*<br>
	 * @param set_mime_type C type : set_mime_type_callback*<br>
	 * @param get_header_map C type : get_header_map_callback*<br>
	 * @param set_header_map C type : set_header_map_callback*
	 */
	public cef_response_t(cef_base_t base, cef_response_t.is_read_only_callback is_read_only, cef_response_t.set_error_callback set_error, cef_response_t.get_status_callback get_status, cef_response_t.set_status_callback set_status, cef_response_t.set_status_text_callback set_status_text, cef_response_t.set_mime_type_callback set_mime_type, cef_response_t.get_header_map_callback get_header_map, cef_response_t.set_header_map_callback set_header_map) {
		super();
		this.base = base;
		this.is_read_only = is_read_only;
		this.set_error = set_error;
		this.get_status = get_status;
		this.set_status = set_status;
		this.set_status_text = set_status_text;
		this.set_mime_type = set_mime_type;
		this.get_header_map = get_header_map;
		this.set_header_map = set_header_map;
	}
	public cef_response_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends cef_response_t implements Structure.ByReference {
		
	};
	public static class ByValue extends cef_response_t implements Structure.ByValue {
		
	};
}
