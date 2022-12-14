package course.c11.toBe;

public class Trousers extends Clothing {

	public Trousers(char gender, int itemID, String description, char colorCode, double price) {
		super(itemID, description, colorCode, price);
		this.gender = gender;
	}

	private char gender = 'F';	//M=Male, F=Female
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void display() {
		super.display();
		System.out.println("Gender: " + getGender());
	}
	
}
