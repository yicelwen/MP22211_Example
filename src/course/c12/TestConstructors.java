package course.c12;

class Super {
	Super(String s) {
		System.out.println("Super");
	}
}

class Sub extends Super {

	Sub(String s) {
		super(s);
		System.out.println("Sub");
	}

	Sub(String s1, String s2) {
		this(s1);	// will compile?
		System.out.println("Sub");
	}

}

public class TestConstructors {
	public static void main(String[] args) {		
		new Sub("Jim");
		System.out.println("--------");
		new Sub("Hi", "Jim");
	}
}
