package course.c12;

class SuperClass {
}

class ChildClass {
	ChildClass(int x) {
		super(); // 踩階梯到父類別
		this(); // 再踩一次階梯到父類別的父類別！
	}

	ChildClass() {
		super();
	}
}
