package course.c16.verify2;

public interface InterfaceHasShowMethod {
	public default void show() {
		System.out.println("另一個介面也有相同簽名的方法！");
	}
}
