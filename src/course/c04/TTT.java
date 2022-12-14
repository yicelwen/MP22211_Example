package course.c04;

public class TTT {
	public int size;
	public double price = 100.5;

	public void display() {
		int size = 5;
		System.out.println(size);
		System.out.println(price);
	/*	if (5 > 2) {
			int size = 9; // compile error!
			System.out.println(size);
		}	*/
	}
	public static void main(String[] args) {
		new TTT().display();
	}
}
