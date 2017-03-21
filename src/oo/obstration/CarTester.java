package oo.obstration;

public class CarTester {

	public static void main(String[] args) {
		Car c1 = new Car("Toyota", 1800, "Altis", "Sedan");
		Car c2 = new Car("Honda", 2000, "Accord", "Sedan");
		Car c3 = new Car("Toyota", 2000, "Wish", "Sedan");
		int[] n = new int[5];
		System.out.println(n[2]);

		Car[] cars = new Car[3];
		cars[0] = new Car("Toyota", 1800, "Altis", "Sedan");
		cars[1] = new Car("Honda", 2000, "Accord", "Sedan");
		cars[2] = new Car("Toyota", 2000, "Wish", "Sedan");
		cars[0].id = 301;
		cars[1].id = 302;
		cars[2].id = 303;
		System.out.println(cars[0].name);
		int i = 0;
		for (i = 0; i < 3; i++) {
			System.out.print(cars[i].name);
		}
		System.out.println(i);
	}

	class AA {
	}

	AA a = new AA();
}
