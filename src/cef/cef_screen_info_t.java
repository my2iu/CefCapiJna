package cef;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : include\internal\cef_types.h:373</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class cef_screen_info_t extends Structure {
	public float device_scale_factor;
	public int depth;
	public int depth_per_component;
	public int is_monochrome;
	/** C type : cef_rect_t */
	public cef_rect_t rect;
	/** C type : cef_rect_t */
	public cef_rect_t available_rect;
	public cef_screen_info_t() {
		super();
	}
	protected List <String> getFieldOrder() {
		return Arrays.asList("device_scale_factor", "depth", "depth_per_component", "is_monochrome", "rect", "available_rect");
	}
	/**
	 * @param rect C type : cef_rect_t<br>
	 * @param available_rect C type : cef_rect_t
	 */
	public cef_screen_info_t(float device_scale_factor, int depth, int depth_per_component, int is_monochrome, cef_rect_t rect, cef_rect_t available_rect) {
		super();
		this.device_scale_factor = device_scale_factor;
		this.depth = depth;
		this.depth_per_component = depth_per_component;
		this.is_monochrome = is_monochrome;
		this.rect = rect;
		this.available_rect = available_rect;
	}
	public cef_screen_info_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends cef_screen_info_t implements Structure.ByReference {
		
	};
	public static class ByValue extends cef_screen_info_t implements Structure.ByValue {
		
	};
}