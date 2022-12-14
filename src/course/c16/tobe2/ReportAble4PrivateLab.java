package course.c16.tobe2;

public interface ReportAble4PrivateLab {
	
	public String getName();
	public double getTotalPrice();
	public double getTotalCost();
	public double getProfit();
	
	public default void show() {
		showPrivate();
	//	reportPrivate(this);
	}
	
	private void showPrivate() {
		System.out.println(
				this.getName() +
				"\t" + this.getTotalPrice() + 
				"\t" + this.getTotalCost() + 
				"\t" + this.getTotalPrice());
	}
	
	public static void report(ReportAble4PrivateLab item) {
		reportPrivate(item);
	}
	
	private static void reportPrivate(ReportAble4PrivateLab item) {
		System.out.println(
				item.getName() +
				"\t" + item.getTotalPrice() + 
				"\t" + item.getTotalCost() + 
				"\t" + item.getTotalPrice());
	}
}
