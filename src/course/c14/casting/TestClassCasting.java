package course.c14.casting;

public class TestClassCasting {
	public static void main(String[] args) {
		Manager m = new Manager();
		testCastClass(m);
	}

	private static void testCastClass(Manager m) {
		Employee e = (Employee) m;
		Manager m2 = (Manager) m;
		Director d = (Director) m;
	}

}
