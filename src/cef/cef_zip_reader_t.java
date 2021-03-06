package cef;
import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : include\capi\cef_zip_reader_capi.h:31</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class cef_zip_reader_t extends Structure {
	/** C type : cef_base_t */
	public cef_base_t base;
	/** C type : move_to_first_file_callback* */
	public cef_zip_reader_t.move_to_first_file_callback move_to_first_file;
	/** C type : move_to_next_file_callback* */
	public cef_zip_reader_t.move_to_next_file_callback move_to_next_file;
	/** C type : move_to_file_callback* */
	public cef_zip_reader_t.move_to_file_callback move_to_file;
	/** C type : close_callback* */
	public cef_zip_reader_t.close_callback close;
	/** C type : open_file_callback* */
	public cef_zip_reader_t.open_file_callback open_file;
	/** C type : close_file_callback* */
	public cef_zip_reader_t.close_file_callback close_file;
	/** C type : read_file_callback* */
	public cef_zip_reader_t.read_file_callback read_file;
	/** C type : eof_callback* */
	public cef_zip_reader_t.eof_callback eof;
	/** <i>native declaration : include\capi\cef_zip_reader_capi.h:19</i> */
	public interface move_to_first_file_callback extends Callback {
		int apply(cef_zip_reader_t self);
	};
	/** <i>native declaration : include\capi\cef_zip_reader_capi.h:20</i> */
	public interface move_to_next_file_callback extends Callback {
		int apply(cef_zip_reader_t self);
	};
	/** <i>native declaration : include\capi\cef_zip_reader_capi.h:21</i> */
	public interface move_to_file_callback extends Callback {
		int apply(cef_zip_reader_t self, cef_string_utf16_t fileName, int caseSensitive);
	};
	/** <i>native declaration : include\capi\cef_zip_reader_capi.h:22</i> */
	public interface close_callback extends Callback {
		int apply(cef_zip_reader_t self);
	};
	/** <i>native declaration : include\capi\cef_zip_reader_capi.h:23</i> */
	public interface cef_string_userfree_t_callback extends Callback {
		int apply(cef_zip_reader_t self);
	};
	/** <i>native declaration : include\capi\cef_zip_reader_capi.h:24</i> */
	public interface int64_callback extends Callback {
		int apply(cef_zip_reader_t self);
	};
	/** <i>native declaration : include\capi\cef_zip_reader_capi.h:25</i> */
	public interface cef_time_t_callback extends Callback {
		int apply(cef_zip_reader_t self);
	};
	/** <i>native declaration : include\capi\cef_zip_reader_capi.h:26</i> */
	public interface open_file_callback extends Callback {
		int apply(cef_zip_reader_t self, cef_string_utf16_t password);
	};
	/** <i>native declaration : include\capi\cef_zip_reader_capi.h:27</i> */
	public interface close_file_callback extends Callback {
		int apply(cef_zip_reader_t self);
	};
	/** <i>native declaration : include\capi\cef_zip_reader_capi.h:28</i> */
	public interface read_file_callback extends Callback {
		int apply(cef_zip_reader_t self, Pointer buffer, int bufferSize);
	};
	/** <i>native declaration : include\capi\cef_zip_reader_capi.h:29</i> */
	public interface int64_callback2 extends Callback {
		int apply(cef_zip_reader_t self);
	};
	/** <i>native declaration : include\capi\cef_zip_reader_capi.h:30</i> */
	public interface eof_callback extends Callback {
		int apply(cef_zip_reader_t self);
	};
	public cef_zip_reader_t() {
		super();
	}
	protected List <String> getFieldOrder() {
		return Arrays.asList("base", "move_to_first_file", "move_to_next_file", "move_to_file", "close", "open_file", "close_file", "read_file", "eof");
	}
	/**
	 * @param base C type : cef_base_t<br>
	 * @param move_to_first_file C type : move_to_first_file_callback*<br>
	 * @param move_to_next_file C type : move_to_next_file_callback*<br>
	 * @param move_to_file C type : move_to_file_callback*<br>
	 * @param close C type : close_callback*<br>
	 * @param open_file C type : open_file_callback*<br>
	 * @param close_file C type : close_file_callback*<br>
	 * @param read_file C type : read_file_callback*<br>
	 * @param eof C type : eof_callback*
	 */
	public cef_zip_reader_t(cef_base_t base, cef_zip_reader_t.move_to_first_file_callback move_to_first_file, cef_zip_reader_t.move_to_next_file_callback move_to_next_file, cef_zip_reader_t.move_to_file_callback move_to_file, cef_zip_reader_t.close_callback close, cef_zip_reader_t.open_file_callback open_file, cef_zip_reader_t.close_file_callback close_file, cef_zip_reader_t.read_file_callback read_file, cef_zip_reader_t.eof_callback eof) {
		super();
		this.base = base;
		this.move_to_first_file = move_to_first_file;
		this.move_to_next_file = move_to_next_file;
		this.move_to_file = move_to_file;
		this.close = close;
		this.open_file = open_file;
		this.close_file = close_file;
		this.read_file = read_file;
		this.eof = eof;
	}
	public cef_zip_reader_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends cef_zip_reader_t implements Structure.ByReference {
		
	};
	public static class ByValue extends cef_zip_reader_t implements Structure.ByValue {
		
	};
}
