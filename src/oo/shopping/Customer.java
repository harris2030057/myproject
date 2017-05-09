package oo.shopping;

public class Customer {
	int custom;
	int price;
	int discount;
	int feedback;
	static int nomal = 0;

	public Customer() {

	}

	public Customer(int custom, int price, int discount, int feedback) {
		this.custom = custom;
		this.price = price;
		this.discount = discount;
		this.feedback = feedback;

	}

	private String getScore(int custom) {
		if (custom == 0) {
			return String.valueOf(custom) + "*";
		} else {
			return String.valueOf(custom);
		}
	}

}
