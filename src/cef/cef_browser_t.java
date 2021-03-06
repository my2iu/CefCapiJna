package cef;
import cef.CefLibrary._cef_frame_t;
import cef.CefLibrary._cef_process_message_t;
import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.LongByReference;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : include\capi\cef_browser_capi.h:47</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class cef_browser_t extends Structure {
	/** C type : cef_base_t */
	public cef_base_t base;
	/** C type : get_host_callback* */
	public cef_browser_t.get_host_callback get_host;
	/** C type : can_go_back_callback* */
	public cef_browser_t.can_go_back_callback can_go_back;
	/** C type : go_back_callback* */
	public cef_browser_t.go_back_callback go_back;
	/** C type : can_go_forward_callback* */
	public cef_browser_t.can_go_forward_callback can_go_forward;
	/** C type : go_forward_callback* */
	public cef_browser_t.go_forward_callback go_forward;
	/** C type : is_loading_callback* */
	public cef_browser_t.is_loading_callback is_loading;
	/** C type : reload_callback* */
	public cef_browser_t.reload_callback reload;
	/** C type : reload_ignore_cache_callback* */
	public cef_browser_t.reload_ignore_cache_callback reload_ignore_cache;
	/** C type : stop_load_callback* */
	public cef_browser_t.stop_load_callback stop_load;
	/** C type : get_identifier_callback* */
	public cef_browser_t.get_identifier_callback get_identifier;
	/** C type : is_same_callback* */
	public cef.cef_v8value_t.is_same_callback is_same;
	/** C type : is_popup_callback* */
	public cef_browser_t.is_popup_callback is_popup;
	/** C type : has_document_callback* */
	public cef_browser_t.has_document_callback has_document;
	/** C type : get_main_frame_callback* */
	public cef_browser_t.get_main_frame_callback get_main_frame;
	/** C type : get_focused_frame_callback* */
	public cef_browser_t.get_focused_frame_callback get_focused_frame;
	/** C type : get_frame_byident_callback* */
	public cef_browser_t.get_frame_byident_callback get_frame_byident;
	/** C type : get_frame_callback* */
	public cef.cef_v8stack_trace_t.get_frame_callback get_frame;
	/** C type : get_frame_count_callback* */
	public cef.cef_v8stack_trace_t.get_frame_count_callback get_frame_count;
	/** C type : get_frame_identifiers_callback* */
	public cef_browser_t.get_frame_identifiers_callback get_frame_identifiers;
	/** C type : get_frame_names_callback* */
	public cef_browser_t.get_frame_names_callback get_frame_names;
	/** C type : send_process_message_callback* */
	public cef_browser_t.send_process_message_callback send_process_message;
	/** <i>native declaration : include\capi\cef_browser_capi.h:26</i> */
	public interface get_host_callback extends Callback {
		cef_browser_host_t apply(cef_browser_t self);
	};
	/** <i>native declaration : include\capi\cef_browser_capi.h:27</i> */
	public interface can_go_back_callback extends Callback {
		int apply(cef_browser_t self);
	};
	/** <i>native declaration : include\capi\cef_browser_capi.h:28</i> */
	public interface go_back_callback extends Callback {
		void apply(cef_browser_t self);
	};
	/** <i>native declaration : include\capi\cef_browser_capi.h:29</i> */
	public interface can_go_forward_callback extends Callback {
		int apply(cef_browser_t self);
	};
	/** <i>native declaration : include\capi\cef_browser_capi.h:30</i> */
	public interface go_forward_callback extends Callback {
		void apply(cef_browser_t self);
	};
	/** <i>native declaration : include\capi\cef_browser_capi.h:31</i> */
	public interface is_loading_callback extends Callback {
		int apply(cef_browser_t self);
	};
	/** <i>native declaration : include\capi\cef_browser_capi.h:32</i> */
	public interface reload_callback extends Callback {
		void apply(cef_browser_t self);
	};
	/** <i>native declaration : include\capi\cef_browser_capi.h:33</i> */
	public interface reload_ignore_cache_callback extends Callback {
		void apply(cef_browser_t self);
	};
	/** <i>native declaration : include\capi\cef_browser_capi.h:34</i> */
	public interface stop_load_callback extends Callback {
		void apply(cef_browser_t self);
	};
	/** <i>native declaration : include\capi\cef_browser_capi.h:35</i> */
	public interface get_identifier_callback extends Callback {
		int apply(cef_browser_t self);
	};
	/** <i>native declaration : include\capi\cef_browser_capi.h:36</i> */
	public interface is_same_callback extends Callback {
		int apply(cef_browser_t self, cef_browser_t that);
	};
	/** <i>native declaration : include\capi\cef_browser_capi.h:37</i> */
	public interface is_popup_callback extends Callback {
		int apply(cef_browser_t self);
	};
	/** <i>native declaration : include\capi\cef_browser_capi.h:38</i> */
	public interface has_document_callback extends Callback {
		int apply(cef_browser_t self);
	};
	/** <i>native declaration : include\capi\cef_browser_capi.h:39</i> */
	public interface get_main_frame_callback extends Callback {
		_cef_frame_t apply(cef_browser_t self);
	};
	/** <i>native declaration : include\capi\cef_browser_capi.h:40</i> */
	public interface get_focused_frame_callback extends Callback {
		_cef_frame_t apply(cef_browser_t self);
	};
	/** <i>native declaration : include\capi\cef_browser_capi.h:41</i> */
	public interface get_frame_byident_callback extends Callback {
		_cef_frame_t apply(cef_browser_t self, long identifier);
	};
	/** <i>native declaration : include\capi\cef_browser_capi.h:42</i> */
	public interface get_frame_callback extends Callback {
		_cef_frame_t apply(cef_browser_t self, cef_string_utf16_t name);
	};
	/** <i>native declaration : include\capi\cef_browser_capi.h:43</i> */
	public interface get_frame_count_callback extends Callback {
		int apply(cef_browser_t self);
	};
	/** <i>native declaration : include\capi\cef_browser_capi.h:44</i> */
	public interface get_frame_identifiers_callback extends Callback {
		void apply(cef_browser_t self, IntByReference identifiersCount, LongByReference identifiers);
	};
	/** <i>native declaration : include\capi\cef_browser_capi.h:45</i> */
	public interface get_frame_names_callback extends Callback {
		void apply(cef_browser_t self, Pointer names);
	};
	/** <i>native declaration : include\capi\cef_browser_capi.h:46</i> */
	public interface send_process_message_callback extends Callback {
		int apply(cef_browser_t self, int target_process, _cef_process_message_t message);
	};
	public cef_browser_t() {
		super();
	}
	protected List <String> getFieldOrder() {
		return Arrays.asList("base", "get_host", "can_go_back", "go_back", "can_go_forward", "go_forward", "is_loading", "reload", "reload_ignore_cache", "stop_load", "get_identifier", "is_same", "is_popup", "has_document", "get_main_frame", "get_focused_frame", "get_frame_byident", "get_frame", "get_frame_count", "get_frame_identifiers", "get_frame_names", "send_process_message");
	}
	public cef_browser_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends cef_browser_t implements Structure.ByReference {
		
	};
	public static class ByValue extends cef_browser_t implements Structure.ByValue {
		
	};
}
