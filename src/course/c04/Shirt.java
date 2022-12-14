package course.c04;

/* this is a class
 * to show you what a class is.
 */
class Shirt {
	// this is a field
	int size;
	double price = 100.5;

	// this is a method
	double getPrice() {
		return price;
	}

	void display() {
		System.out.println("size = " + size);
		System.out.println("price = " + price);
	}
}
