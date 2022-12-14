package course.c11;

public interface InterfaceModifierLab {

	/* before Java 8, method has no body */
	public abstract void abstractMethod1();
	abstract void abstractMethod2();	// 隱含 public
	void abstractMethod3();	// 隱含 public abstract

	/* after Java 8, default method has body */
	public default void defaultMethod1() {}
	default void defaultMethod2() {}	// 隱含 public
	
	/* after Java 8, static method has body */
	public static void staticMethod1() {}
	static void staticMethod2() {}	// 隱含 public
	
	/* after Java 9, method with body could be private */
	private static void privateMethod1() {}	// 可以被public static/default方法使用
	private void privateMethod2() {}	// 可以被public default方法使用
//	private default void privateMethod3() {}	// 編譯失敗：private與default衝突 

}
