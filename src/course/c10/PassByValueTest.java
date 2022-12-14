package course.c10;

import course.c05.Shirt;

public class PassByValueTest {
	public static void main(String[] args) {
		testPrimitive();
		testReference();
	}

	private static void testPrimitive() {
		int x = 10;
		int y = x;
		x = 5;
		System.out.println("y = " + y);
	}

	private static void testReference() {
		Shirt x = new Shirt();
		x.size = 5;
		Shirt y = x;
		x.size = 4;
		System.out.println("Shirt size = " + y.size);
		modifyShirt(x);
		System.out.println("Shirt size = " + x.size);
	}

	private static void modifyShirt(Shirt s) {
		s = new Shirt();
		s.size = 3;
	}
}
