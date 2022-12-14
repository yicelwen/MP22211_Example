package course.c05;

public class AutoPromotion {

	public static void main(String[] args) {

		/* Automatic Promotion for assign small to large*/
		byte x1 = 10;
		short x2 = x1;
		int y1 = 10;
		long y2 = y1;
		
		float z1 = 10.0f;
		double z2 = z1;
		
		/* Automatic Promotion for assign integer to floating */
		float e = 2;		
		double f = 2;		
		float g = 2L;		
		double h = 2L;		
		
		/* Can not assign floating to integer!! 
		   will cause the lost of decimal point!! */
		int a = 2.34f;		// 編譯失敗
		long b = 2.34f;		// 編譯失敗
		int c = 2.34;		// 編譯失敗
		long d = 2.34;		// 編譯失敗

	}

}
