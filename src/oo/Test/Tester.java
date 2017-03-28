package oo.Test;

import java.util.ArrayList;
import java.util.Scanner;

import oo.obstration.Car;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car("XX", 1800, "YY", "ZZ");
		ArrayList<String> a = new ArrayList();
		a.add("331");
		a.add("821");
		a.add("886");
//		a.add(true);
		System.out.println(a.size());
		a.add("554");
		System.out.println(a.size());
		a.set(2, "zzzzzzzzzzzzzz");
		System.out.println(a);
        String data =  a.get(3);
//      int n = (int)a.get(4);
        System.out.println("本次開獎號碼為：331,821,886,554;");
        Scanner scanner = new Scanner(System.in);
        System.out.println("請使用者輸入發票存根(長度不限)，判斷末三碼是否中獎：");
        String s = scanner.nextLine();
              
              
	}
}
