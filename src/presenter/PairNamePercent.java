package presenter;

public class PairNamePercent {
	private String name;
	private Double percentage;

	public PairNamePercent(String name, Double percentage) {
		this.name = name;
		this.percentage = percentage;
	}

	public String getName() {
		return name;
	}

	public Double getPercentage() {
		return percentage;
	}
}
