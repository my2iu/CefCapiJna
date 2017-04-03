package cef;
import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : include\capi\cef_download_item_capi.h:48</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class cef_download_item_t extends Structure {
	/** C type : cef_base_t */
	public cef_base_t base;
	/** C type : is_valid_callback* */
	public cef_download_item_t.is_valid_callback is_valid;
	/** C type : is_in_progress_callback* */
	public cef_download_item_t.is_in_progress_callback is_in_progress;
	/** C type : is_complete_callback* */
	public cef_download_item_t.is_complete_callback is_complete;
	/** C type : is_canceled_callback* */
	public cef_download_item_t.is_canceled_callback is_canceled;
	/** C type : get_percent_complete_callback* */
	public cef_download_item_t.get_percent_complete_callback get_percent_complete;
	/** C type : get_id_callback* */
	public cef_download_item_t.get_id_callback get_id;
	/** <i>native declaration : include\capi\cef_download_item_capi.h:31</i> */
	public interface is_valid_callback extends Callback {
		int apply(cef_download_item_t self);
	};
	/** <i>native declaration : include\capi\cef_download_item_capi.h:32</i> */
	public interface is_in_progress_callback extends Callback {
		int apply(cef_download_item_t self);
	};
	/** <i>native declaration : include\capi\cef_download_item_capi.h:33</i> */
	public interface is_complete_callback extends Callback {
		int apply(cef_download_item_t self);
	};
	/** <i>native declaration : include\capi\cef_download_item_capi.h:34</i> */
	public interface is_canceled_callback extends Callback {
		int apply(cef_download_item_t self);
	};
	/** <i>native declaration : include\capi\cef_download_item_capi.h:35</i> */
	public interface int64_callback extends Callback {
		int apply(cef_download_item_t self);
	};
	/** <i>native declaration : include\capi\cef_download_item_capi.h:36</i> */
	public interface get_percent_complete_callback extends Callback {
		int apply(cef_download_item_t self);
	};
	/** <i>native declaration : include\capi\cef_download_item_capi.h:37</i> */
	public interface int64_callback2 extends Callback {
		int apply(cef_download_item_t self);
	};
	/** <i>native declaration : include\capi\cef_download_item_capi.h:38</i> */
	public interface int64_callback3 extends Callback {
		int apply(cef_download_item_t self);
	};
	/** <i>native declaration : include\capi\cef_download_item_capi.h:39</i> */
	public interface cef_time_t_callback extends Callback {
		int apply(cef_download_item_t self);
	};
	/** <i>native declaration : include\capi\cef_download_item_capi.h:40</i> */
	public interface cef_time_t_callback2 extends Callback {
		int apply(cef_download_item_t self);
	};
	/** <i>native declaration : include\capi\cef_download_item_capi.h:41</i> */
	public interface cef_string_userfree_t_callback extends Callback {
		int apply(cef_download_item_t self);
	};
	/** <i>native declaration : include\capi\cef_download_item_capi.h:42</i> */
	public interface get_id_callback extends Callback {
		int apply(cef_download_item_t self);
	};
	/** <i>native declaration : include\capi\cef_download_item_capi.h:43</i> */
	public interface cef_string_userfree_t_callback2 extends Callback {
		int apply(cef_download_item_t self);
	};
	/** <i>native declaration : include\capi\cef_download_item_capi.h:44</i> */
	public interface cef_string_userfree_t_callback3 extends Callback {
		int apply(cef_download_item_t self);
	};
	/** <i>native declaration : include\capi\cef_download_item_capi.h:45</i> */
	public interface cef_string_userfree_t_callback4 extends Callback {
		int apply(cef_download_item_t self);
	};
	/** <i>native declaration : include\capi\cef_download_item_capi.h:46</i> */
	public interface cef_string_userfree_t_callback5 extends Callback {
		int apply(cef_download_item_t self);
	};
	/** <i>native declaration : include\capi\cef_download_item_capi.h:47</i> */
	public interface cef_string_userfree_t_callback6 extends Callback {
		int apply(cef_download_item_t self);
	};
	public cef_download_item_t() {
		super();
	}
	protected List <String> getFieldOrder() {
		return Arrays.asList("base", "is_valid", "is_in_progress", "is_complete", "is_canceled", "get_percent_complete", "get_id");
	}
	/**
	 * @param base C type : cef_base_t<br>
	 * @param is_valid C type : is_valid_callback*<br>
	 * @param is_in_progress C type : is_in_progress_callback*<br>
	 * @param is_complete C type : is_complete_callback*<br>
	 * @param is_canceled C type : is_canceled_callback*<br>
	 * @param get_percent_complete C type : get_percent_complete_callback*<br>
	 * @param get_id C type : get_id_callback*
	 */
	public cef_download_item_t(cef_base_t base, cef_download_item_t.is_valid_callback is_valid, cef_download_item_t.is_in_progress_callback is_in_progress, cef_download_item_t.is_complete_callback is_complete, cef_download_item_t.is_canceled_callback is_canceled, cef_download_item_t.get_percent_complete_callback get_percent_complete, cef_download_item_t.get_id_callback get_id) {
		super();
		this.base = base;
		this.is_valid = is_valid;
		this.is_in_progress = is_in_progress;
		this.is_complete = is_complete;
		this.is_canceled = is_canceled;
		this.get_percent_complete = get_percent_complete;
		this.get_id = get_id;
	}
	public cef_download_item_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends cef_download_item_t implements Structure.ByReference {
		
	};
	public static class ByValue extends cef_download_item_t implements Structure.ByValue {
		
	};
}
