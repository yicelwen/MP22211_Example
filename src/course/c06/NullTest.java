package course.c06;

import course.c05.Shirt;

public class NullTest {

	public static void main(String[] args) {

		Shirt nullShirt = null;
		System.out.println(nullShirt);

	//	System.out.println(null);	// compile error

		String s1 = null + "Hi";
		System.out.println(s1);
		
		String s2 = "Hi" + null;
		System.out.println(s2);
		
		
		System.out.println(nullShirt.price);
	}
}
