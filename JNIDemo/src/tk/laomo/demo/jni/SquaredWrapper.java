package tk.laomo.demo.jni;

public class SquaredWrapper {
	public native int squared(int base);

	static {
		System.loadLibrary("squared");
	}
}
