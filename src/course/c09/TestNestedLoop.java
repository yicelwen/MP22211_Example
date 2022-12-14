package course.c09;

public class TestNestedLoop {

	public static void main(String[] args) {
		printTriangle();
		guessWord();
	}

	private static void printTriangle() {
		int num = 5;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

	private static void guessWord() {
		String word = "jim";
		String guessWord = "";
		int tryCounts = 0;
		while (!guessWord.equals(word.toUpperCase())) {
			guessWord = "";
			while (guessWord.length() < word.length()) {
				char c = (char) (Math.random() * 26 + 65);
				guessWord = guessWord + c;
			}
			// System.out.println(guessWord);
			tryCounts++;
		}
		System.out.println(word + " was found!!");
		System.out.println("After " + tryCounts + " tries!!");
	}

}
