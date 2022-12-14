package course.c10;

public class CalculatorTester4BadPractice {

	public static void main(String[] args) {
		int totalOne = CalculatorBadPractice.sumForInt(2, 5);
		System.out.println(totalOne);
		float totalTwo = CalculatorBadPractice.sumForFloatAndInt(12.9f, 12);
		System.out.println(totalTwo);
		float totalThree = CalculatorBadPractice.sumForIntAndFloat(12, 12.9f);
		System.out.println(totalThree);

	}

}
