package course.c12;


interface Skill_1 {
	void makeMoney();
}
interface Skill_2 {
	void makeMoney();
}

interface Skill_3 {
	default void makeMoney() {
		System.out.println("from Skill_3");
	}
}
interface Skill_4 {
	default void makeMoney() {
		System.out.println("from Skill_3");
	}
}

class Father {
	void makeMoney() {
		System.out.println("from Father");
	}
}
class Mother {
	public void makeMoney() {
		System.out.println("from Mother");
	}
}

// Java不允許多繼承，因為可能遇到相同內容的方法，造成衝突
// class BadChild1 extends Father, Mother { }

// Java允許實作多個介面，因為介面方法內容為空，而且子類別必須覆寫內容
class GoodChild1 implements Skill_1, Skill_2 {
	@Override
	public void makeMoney() {
		System.out.println("make money by java and database");
	}
}

// 若實作的多個介面裡有相同名稱的default方法，子類別就必須覆寫該方法，即便是抽象子類別
// abstract class BadChild2 implements Skill_3, Skill_4 { }

// 若實作的多個介面裡有相同名稱的default方法，子類別就必須覆寫該方法
class GoodChild2 implements Skill_3, Skill_4 {
	@Override
	public void makeMoney() {
		System.out.println("Override the same default method name");
	}
}

//若繼承的父類別與實作的介面有相同簽名且都是public的方法，可以以父類別的方法提供介面抽象方法的實作，所以子類別不須再覆寫
class GoodGirl1 extends Mother implements Skill_1 {

}

class GoodGirl2 extends Mother implements Skill_3 {

}

// 繼承的父類別與實作的介面雖然有相同簽名的方法，但父類別方法是package層級的存取權限，無法覆寫用介面的public層級存取權限的方法，所以子類別必須覆寫
class GoodBoy1 extends Father implements Skill_2 {
	@Override
	public void makeMoney() {
		super.makeMoney();
	}
}

class GoodBoy2 extends Father implements Skill_4 {
	@Override
	public void makeMoney() {
		super.makeMoney();
	}
}

public class ShowMultiInterfaces  {
	public static void main(String args[]) {
		new GoodChild1().makeMoney();
		new GoodChild2().makeMoney();
		new GoodBoy1().makeMoney();
		new GoodBoy2().makeMoney();
		new GoodGirl1().makeMoney();
		new GoodGirl2().makeMoney();
	}
}
