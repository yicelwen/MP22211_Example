package course.c16.verify;

public class SuperClassHasShowMethod {

//	protected void show() {
	public void show() {
		System.out.println("父類別方法可以遮蔽介面，但必須是public！");
	}
}
