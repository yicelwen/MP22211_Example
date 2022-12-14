package course.c15;

public class StaticCounter {
	private static int counter = 0;

	public StaticCounter() {
		counter++;
	}

	public static int getCount() {
		return counter;
	}

	public static void main(String args[]) {
		new StaticCounter();
		new StaticCounter();
		System.out.println("count: " + StaticCounter.getCount());
	}
}
