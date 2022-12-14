package course.c06;

public class WrapperClassDemo {

	public static void main(String[] args) {

		Byte b = Byte.valueOf((byte) 1);

		Short s = Short.valueOf((short) 2);

		Integer i = Integer.parseInt("3");

		Long l = Long.valueOf(4);

		Float f = Float.valueOf("2.01");

		Double d = Double.valueOf(3.01);

		Character c = Character.valueOf('a');

		Boolean bTrue = Boolean.valueOf(true);
		Boolean bFalse1 = Boolean.valueOf(false);
		Boolean bFalse2 = Boolean.valueOf(null);

		System.out.println("Short is between " + Short.MAX_VALUE + " ~ " + Short.MIN_VALUE);

		System.out.println(i.compareTo(5));
		System.out.println(l.compareTo(i.longValue()));

		System.out.println(Long.sum(2, 5));

		System.out.println("null value of Boolean is: " + bFalse2);

	}

}
