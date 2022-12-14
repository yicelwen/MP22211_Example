package course.c15;

public class StaticErrorClass {
	private int instanceField; // 物件欄位

	public void instanceMethod() { // 物件方法
		instanceField = 2;
	}

	public static void staticMethod() { // 類別/static方法
		instanceField = 1; // 編譯失敗，static方法不能呼叫物件欄位
		instanceMethod(); // 編譯失敗，static方法不能呼叫物件方法
	}
}
