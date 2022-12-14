package course.c11;

class SuperXParent {
	public SuperXParent() {
		super();
		System.out.println("動物界");
	}
}

class Super4Parent extends SuperXParent {
	public Super4Parent() {
		super();
		System.out.println("脊索動物門");
	}
}

class Super3Parent extends Super4Parent {
	public Super3Parent() {
		super();
		System.out.println("哺乳綱");
	}
}

class Super2Parent extends Super3Parent {
	public Super2Parent() {
		super();
		System.out.println("靈長目");
	}
}

class Super1Parent extends Super2Parent {
	public Super1Parent() {
		super();
		System.out.println("人科");
	}
}

class Parent extends Super1Parent {
	public Parent() {
		super();
		System.out.println("人屬");
	}
}

class People extends Parent {
	public People() {
		super();
		System.out.println("智人");
	}
}

public class TestConstructors1 {
	public static void main(String[] args) {
		People c = new People();
	}
}
