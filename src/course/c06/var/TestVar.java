package course.c06.var;

public class TestVar {

	public void whatIsTheType() {
		var name = "Hello";
		var size = 7;
	}

	public void reassignment() {
		var number = 7;
		number = 4;
		number = "5"; // 編譯失敗
	}

	public void showNonVarCasting() {
		short s = (short) 10;
		s = (byte) 5;
		s = 1_000_000; // 編譯失敗
	}
	public void showVarCasting() {
		var s = (short) 10;
		s = (byte) 5;
		s = 1_000_000; // 編譯失敗
	}


	public void doesThisCompile(boolean check) {
		var question; // 編譯失敗
		question = 1;
		var answer; // 編譯失敗
		if (check) {
			answer = 2;
		} else {
			answer = 3;
		}
		System.out.println(answer);
	}

	public void varAsNull() {
		var n = null; // 編譯失敗
	}

	public void compoundDeclarationWithNonVar() {
		int a, b = 3;
		int c = 2, d = 3;
		int e, f;
		int g = 2, h;
		int i, int j; // 編譯失敗
		int k, double l; // 編譯失敗
	}

	public void compoundDeclarationWithVar() {
		var a, b = 3; // 編譯失敗
		// 'var' is not allowed in a compound declaration
		var c = 2, d = 3; // 編譯失敗
		// 'var' is not allowed in a compound declaration
	    int e, var f = 3; // 編譯失敗
	}

	// 非複合宣告
	public void notCompoundDeclaration1() {
		int a;
		int b = 3;
		int c;
		var d = 3;
	}

	// 非複合宣告
	public void notCompoundDeclaration2() {
		int a;
		int b = 3;
		int c;
		var d = 3;
	}

	public void testVarAndNull() {
		var n = "myData";
		n = null;
		var m = 4;
		m = null; // 編譯失敗
		var o = (String) null;
	}

	public int addition(var a, var b) { // 編譯失敗
		return a + b;
	}

}
