package oo.obstration;

public class Main {

	public static void main(String[] args) {
	 Car c = new Car("XX", 1800, "YY", "ZZ");
	 c.setMilage(25000);

	 float current = c.addMilage(80);
	 System.out.println("目前里程數為：" +current);
	}

}
