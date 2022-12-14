package course.c07;

public class MyElevator1Test {
	public static void main(String args[]) {
		MyElevator1 test0 = new MyElevator1();
		test0.open(); // 開門
		test0.close(); // 關門
		test0.down(); // 下樓
		test0.up(); // 上樓
		test0.up(); // 上樓
		test0.up(); // 上樓
		test0.open(); // 開門
		test0.close(); // 關門
		test0.down(); // 下樓
		test0.open(); // 開門
		test0.down(); // 下樓
		test0.open(); // 開門
	}
}
