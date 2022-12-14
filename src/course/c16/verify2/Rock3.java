package course.c16.verify2;

import course.c16.tobe2.ReportAble;

public class Rock3 implements ReportAble, InterfaceHasShowMethod {
	private String name = this.getClass().getSimpleName();
	private double unitPrice;
	private double unitCost;
	private double weight;

	public Rock3(double unitPrice, double unitCost, double weight) {
		this.unitPrice = unitPrice;
		this.unitCost = unitCost;
		this.weight = weight;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double getTotalPrice() {
		return this.weight * this.unitPrice;
	}

	@Override
	public double getTotalCost() {
		return this.weight * this.unitCost;
	}

	@Override
	public double getProfit() {
		return getTotalPrice() - getTotalCost();
	}

	@Override
	public void show() {
		InterfaceHasShowMethod.super.show();
		// other implementation...
	}

}
