package course.c16.tobe2;

public class TestReportAble {

	private static void testDefault() {
		ReportAble[] itemList = new ReportAble[5];
		itemList[0] = new Rock(15.0, 10.0, 50.0);
		itemList[1] = new Rock(11.0, 6.0, 10.0);
		itemList[2] = new Paint(13.0, 8.0, 25.0);
		itemList[3] = new Widget(7.0, 5.0, 10);
		itemList[4] = new Widget(12.0, 12.0, 20);
		System.out.println("** Sales Report for default **");
		System.out.println("Name\tPrice\tCost\tProfit\t");
		System.out.println("==============================");
		for (ReportAble item : itemList) {
			item.show();
		}
	}

	private static void testStatic() {
		ReportAble[] itemList = new ReportAble[5];
		itemList[0] = new Rock(15.0, 10.0, 50.0);
		itemList[1] = new Rock(11.0, 6.0, 10.0);
		itemList[2] = new Paint(13.0, 8.0, 25.0);
		itemList[3] = new Widget(7.0, 5.0, 10);
		itemList[4] = new Widget(12.0, 12.0, 20);
		System.out.println("** Sales Report for static **");
		System.out.println("Name\tPrice\tCost\tProfit\t");
		System.out.println("==============================");
		for (ReportAble item : itemList) {
			ReportAble.report(item);
		}
	}

	public static void main(String args[]) {
		testDefault();
		System.out.println("-------------------------------------");
		testStatic();
	}
}
