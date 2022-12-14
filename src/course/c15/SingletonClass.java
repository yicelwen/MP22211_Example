package course.c15;

public class SingletonClass {
	private SingletonClass() {
	}

	private static final SingletonClass instance = new SingletonClass();

	public static SingletonClass getInstance() {
		return instance;
	}

	public static void main(String[] args) {
		SingletonClass ref1 = SingletonClass.getInstance();
		SingletonClass ref2 = SingletonClass.getInstance();
		System.out.println(ref1 == ref2);
	}
}
