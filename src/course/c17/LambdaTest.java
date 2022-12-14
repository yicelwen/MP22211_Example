package course.c17;

// 方法未帶參數
@FunctionalInterface
interface Param_0 {
	int getInt();
}

// 方法帶1個參數
@FunctionalInterface
interface Param_1 {
	int getInt(int x);
}

// 方法帶2個參數
@FunctionalInterface
interface Param_2 {
	int getInt(int x, int y);
}

// 方法有回傳
@FunctionalInterface
interface ReturnHas {
	boolean hasReturn(String a, String b);
}

// 方法沒有回傳
@FunctionalInterface
interface ReturnNo {
	void noReturn(String a, String b);
}

public class LambdaTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// 方法未帶參數
		Param_0 p01 = () -> 100;
//		Param_0 p02 = -> 100; 	// 編譯失敗，需有( )

		// 方法帶1個參數
		Param_1 p11 = (int x) -> 2 * x;
		Param_1 p12 = (x) -> 2 * x;
		Param_1 p13 = x -> 2 * x;

		// 方法帶2個參數
		Param_2 p21 = (int x, int y) -> x + y;
		Param_2 p22 = (x, y) -> x + y;
//		Param_2 p23 = x, y -> x + y;	// 編譯失敗，需有( )

		// 方法有回傳
		ReturnHas returnHas1 = (a, b) -> a.startsWith(b);	// 回傳boolean結果
		ReturnHas returnHas2 = (a, b) -> a.length() > b.length();	// 運算式無變數承接結果，視同回傳結果
		ReturnHas returnHas3 = (a, b) -> {	// 使用 { }，和一般方法寫法一樣
			return a.length() > b.length();
		}; 

		// 方法沒有回傳
		ReturnNo returnNo1 = (a, b) -> a.startsWith(b);	// 只是呼叫方法
//		ReturnNo returnNo2 = (a, b) -> a.length() > b.length(); // 編譯失敗。運算式無變數承接結果，視同回傳結果
		ReturnNo returnNo3 = (a, b) -> {	// 使用 { }，和一般方法寫法一樣
			System.out.println(a.length() > b.length());
		};
	}

	public void noReturn(String x, String y) {
		x.length(); 
		// x.length() + y.length(); // 編譯失敗，運算式要變數承接結果或回傳結果
		int z = x.length() + y.length(); 
		System.out.println(x.length() + y.length());
	}

	public int doReturn(String x, String y) {
		x.length(); // compiled
		// x.length() + y.length(); // 編譯失敗，運算式要變數承接結果或回傳結果
		int z = x.length() + y.length(); 
		return x.length() + y.length(); 
	}

}
