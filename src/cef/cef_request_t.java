package cef;
import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : include\capi\cef_request_capi.h:52</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class cef_request_t extends Structure {
	/** C type : cef_base_t */
	public cef_base_t base;
	/** C type : is_read_only_callback* */
	public cef.cef_response_t.is_read_only_callback is_read_only;
	/** C type : set_url_callback* */
	public cef_request_t.set_url_callback set_url;
	/** C type : set_method_callback* */
	public cef_request_t.set_method_callback set_method;
	/** C type : set_referrer_callback* */
	public cef_request_t.set_referrer_callback set_referrer;
	/** C type : get_referrer_policy_callback* */
	public cef_request_t.get_referrer_policy_callback get_referrer_policy;
	/** C type : get_post_data_callback* */
	public cef_request_t.get_post_data_callback get_post_data;
	/** C type : set_post_data_callback* */
	public cef_request_t.set_post_data_callback set_post_data;
	/** C type : get_header_map_callback* */
	public cef.cef_response_t.get_header_map_callback get_header_map;
	/** C type : set_header_map_callback* */
	public cef.cef_response_t.set_header_map_callback set_header_map;
	/** C type : set_callback* */
	public cef.cef_v8accessor_t.set_callback set;
	/** C type : get_flags_callback* */
	public cef_request_t.get_flags_callback get_flags;
	/** C type : set_flags_callback* */
	public cef_request_t.set_flags_callback set_flags;
	/** C type : set_first_party_for_cookies_callback* */
	public cef_request_t.set_first_party_for_cookies_callback set_first_party_for_cookies;
	/** <i>native declaration : include\capi\cef_request_capi.h:32</i> */
	public interface is_read_only_callback extends Callback {
		int apply(cef_request_t self);
	};
	/** <i>native declaration : include\capi\cef_request_capi.h:33</i> */
	public interface cef_string_userfree_t_callback extends Callback {
		int apply(cef_request_t self);
	};
	/** <i>native declaration : include\capi\cef_request_capi.h:34</i> */
	public interface set_url_callback extends Callback {
		void apply(cef_request_t self, cef_string_utf16_t url);
	};
	/** <i>native declaration : include\capi\cef_request_capi.h:35</i> */
	public interface cef_string_userfree_t_callback2 extends Callback {
		int apply(cef_request_t self);
	};
	/** <i>native declaration : include\capi\cef_request_capi.h:36</i> */
	public interface set_method_callback extends Callback {
		void apply(cef_request_t self, cef_string_utf16_t method);
	};
	/** <i>native declaration : include\capi\cef_request_capi.h:37</i> */
	public interface set_referrer_callback extends Callback {
		void apply(cef_request_t self, cef_string_utf16_t referrer_url, int policy);
	};
	/** <i>native declaration : include\capi\cef_request_capi.h:38</i> */
	public interface cef_string_userfree_t_callback3 extends Callback {
		int apply(cef_request_t self);
	};
	/** <i>native declaration : include\capi\cef_request_capi.h:39</i> */
	public interface get_referrer_policy_callback extends Callback {
		int apply(cef_request_t self);
	};
	/** <i>native declaration : include\capi\cef_request_capi.h:40</i> */
	public interface get_post_data_callback extends Callback {
		cef_post_data_t apply(cef_request_t self);
	};
	/** <i>native declaration : include\capi\cef_request_capi.h:41</i> */
	public interface set_post_data_callback extends Callback {
		void apply(cef_request_t self, cef_post_data_t postData);
	};
	/** <i>native declaration : include\capi\cef_request_capi.h:42</i> */
	public interface get_header_map_callback extends Callback {
		void apply(cef_request_t self, Pointer headerMap);
	};
	/** <i>native declaration : include\capi\cef_request_capi.h:43</i> */
	public interface set_header_map_callback extends Callback {
		void apply(cef_request_t self, Pointer headerMap);
	};
	/** <i>native declaration : include\capi\cef_request_capi.h:44</i> */
	public interface set_callback extends Callback {
		void apply(cef_request_t self, cef_string_utf16_t url, cef_string_utf16_t method, cef_post_data_t postData, Pointer headerMap);
	};
	/** <i>native declaration : include\capi\cef_request_capi.h:45</i> */
	public interface get_flags_callback extends Callback {
		int apply(cef_request_t self);
	};
	/** <i>native declaration : include\capi\cef_request_capi.h:46</i> */
	public interface set_flags_callback extends Callback {
		void apply(cef_request_t self, int flags);
	};
	/** <i>native declaration : include\capi\cef_request_capi.h:47</i> */
	public interface cef_string_userfree_t_callback4 extends Callback {
		int apply(cef_request_t self);
	};
	/** <i>native declaration : include\capi\cef_request_capi.h:48</i> */
	public interface set_first_party_for_cookies_callback extends Callback {
		void apply(cef_request_t self, cef_string_utf16_t url);
	};
	/** <i>native declaration : include\capi\cef_request_capi.h:49</i> */
	public interface cef_resource_type_t_callback extends Callback {
		int apply(cef_request_t self);
	};
	/** <i>native declaration : include\capi\cef_request_capi.h:50</i> */
	public interface cef_transition_type_t_callback extends Callback {
		int apply(cef_request_t self);
	};
	/** <i>native declaration : include\capi\cef_request_capi.h:51</i> */
	public interface uint64_callback extends Callback {
		int apply(cef_request_t self);
	};
	public cef_request_t() {
		super();
	}
	protected List <String> getFieldOrder() {
		return Arrays.asList("base", "is_read_only", "set_url", "set_method", "set_referrer", "get_referrer_policy", "get_post_data", "set_post_data", "get_header_map", "set_header_map", "set", "get_flags", "set_flags", "set_first_party_for_cookies");
	}
	public cef_request_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends cef_request_t implements Structure.ByReference {
		
	};
	public static class ByValue extends cef_request_t implements Structure.ByValue {
		
	};
}
