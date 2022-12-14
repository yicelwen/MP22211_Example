package course.c10;

public class MyElevatorJumpTest {
	public static void main(String[] args) {
		MyElevator2 test = new MyElevator2();
		test.toFloor(5);
		boolean isOpen = test.isDoorOpen();
	}
}
