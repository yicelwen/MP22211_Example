package course.c09;

public class TestDoWhileLoop {

	public static void main(String[] args) {
		testDoWhileLoop();
		testWhileLoop();
	}

	public static void testDoWhileLoop() {
		int count = 0;
		do {
			System.out.println("do-while count is: " + count);
		} while (count < 0);
	}

	public static void testWhileLoop() {
		int count = 0;
		while (count < 0) {
			System.out.println("while count is: " + count);
			count++;
		}
	}

}
