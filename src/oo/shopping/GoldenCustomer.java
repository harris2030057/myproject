package oo.shopping;

public class GoldenCustomer extends SilverCustomer {
	float feedback = 0.05f;

	public GoldenCustomer(int total) {
		super(total);
	}

	public void print() {
		System.out.println(total + "\t" + (total * discount) + "\t" + (total * feedback));
	}

}
