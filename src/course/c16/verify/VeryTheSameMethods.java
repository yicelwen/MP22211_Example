package course.c16.verify;

import course.c16.tobe2.ReportAble;

public class VeryTheSameMethods {

	public static void main(String args[]) {
		ReportAble[] itemList = new ReportAble[1];
		itemList[0] = new Rock2(15.0, 10.0, 50.0);
		System.out.println("** Sales Report for Verify **");
		System.out.println("Name\tPrice\tCost\tProfit\t");
		System.out.println("==============================");
		for (ReportAble item : itemList) {
			item.show();
		}
	}
}
