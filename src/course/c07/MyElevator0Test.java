package course.c07;

public class MyElevator0Test {
	public static void main(String args[]) {
		MyElevator0 test0 = new MyElevator0();
		test0.open(); // 開門
		test0.close(); // 關門
		test0.down(); // 下樓。咦，現在已經是最底層?!
		test0.up(); // 上樓
		test0.up(); // 上樓
		test0.up(); // 上樓
		test0.open(); // 開門
		test0.close(); // 關門
		test0.down(); // 下樓
		test0.open(); // 開門
		test0.down(); // 下樓。咦，好像忘了先關門?!
		test0.open(); // 開門。咦，還沒關門，又要開門?!
	}
}
