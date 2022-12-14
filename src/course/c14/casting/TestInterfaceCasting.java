package course.c14.casting;

public class TestInterfaceCasting {
	public static void main(String[] args) {
		try {
			Manager m = new Manager();
			testCastInterface(m);
		} catch (ClassCastException e) {
			e.printStackTrace();
		}

		try {
			Manager d = new Director();
			testCastInterface(d);
		} catch (ClassCastException e) {
			e.printStackTrace();
		}

	}

	private static void testCastInterface(Manager m) {
		Quit q = (Quit) m;
	}
}
