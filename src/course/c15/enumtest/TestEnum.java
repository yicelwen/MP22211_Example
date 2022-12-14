package course.c15.enumtest;

import course.c15.enums.PowerState;

public class TestEnum {

	public static void main(String[] args) {
		System.out.println(PowerState.ON);
		PowerState.ON = null;
	}
}


