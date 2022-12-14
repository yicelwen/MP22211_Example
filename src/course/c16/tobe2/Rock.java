package course.c16.tobe2;

public class Rock implements ReportAble {
	private String name = this.getClass().getSimpleName();
	private double unitPrice;
	private double unitCost;
	private double weight;

	public Rock(double unitPrice, double unitCost, double weight) {
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
	
}
