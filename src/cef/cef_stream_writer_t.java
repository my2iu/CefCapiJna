package cef;
import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : include\capi\cef_stream_capi.h:58</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class cef_stream_writer_t extends Structure {
	/** C type : cef_base_t */
	public cef_base_t base;
	/** C type : write_callback* */
	public cef_stream_writer_t.write_callback write;
	/** C type : seek_callback* */
	public cef_stream_writer_t.seek_callback seek;
	/** C type : tell_callback* */
	public cef_stream_writer_t.tell_callback tell;
	/** C type : flush_callback* */
	public cef_stream_writer_t.flush_callback flush;
	/** C type : may_block_callback* */
	public cef_stream_writer_t.may_block_callback may_block;
	/** <i>native declaration : include\capi\cef_stream_capi.h:53</i> */
	public interface write_callback extends Callback {
		int apply(cef_stream_writer_t self, Pointer ptr, int size, int n);
	};
	/** <i>native declaration : include\capi\cef_stream_capi.h:54</i> */
	public interface seek_callback extends Callback {
		int apply(cef_stream_writer_t self, long offset, int whence);
	};
	/** <i>native declaration : include\capi\cef_stream_capi.h:55</i> */
	public interface tell_callback extends Callback {
		long apply(cef_stream_writer_t self);
	};
	/** <i>native declaration : include\capi\cef_stream_capi.h:56</i> */
	public interface flush_callback extends Callback {
		int apply(cef_stream_writer_t self);
	};
	/** <i>native declaration : include\capi\cef_stream_capi.h:57</i> */
	public interface may_block_callback extends Callback {
		int apply(cef_stream_writer_t self);
	};
	public cef_stream_writer_t() {
		super();
	}
	protected List <String> getFieldOrder() {
		return Arrays.asList("base", "write", "seek", "tell", "flush", "may_block");
	}
	/**
	 * @param base C type : cef_base_t<br>
	 * @param write C type : write_callback*<br>
	 * @param seek C type : seek_callback*<br>
	 * @param tell C type : tell_callback*<br>
	 * @param flush C type : flush_callback*<br>
	 * @param may_block C type : may_block_callback*
	 */
	public cef_stream_writer_t(cef_base_t base, cef_stream_writer_t.write_callback write, cef_stream_writer_t.seek_callback seek, cef_stream_writer_t.tell_callback tell, cef_stream_writer_t.flush_callback flush, cef_stream_writer_t.may_block_callback may_block) {
		super();
		this.base = base;
		this.write = write;
		this.seek = seek;
		this.tell = tell;
		this.flush = flush;
		this.may_block = may_block;
	}
	public cef_stream_writer_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends cef_stream_writer_t implements Structure.ByReference {
		
	};
	public static class ByValue extends cef_stream_writer_t implements Structure.ByValue {
		
	};
}