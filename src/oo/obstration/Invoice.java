package oo.obstration;

import java.util.ArrayList;
import java.util.Scanner;

import oo.stati.Student;

public class Invoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList();
		String s = "331";
		String n = "1265846541566498765453";
		System.out.println(n.length());
		String sub = n.substring(n.length()-3);
		System.out.println(sub);

		a.add("331");
		a.add("821");
		a.add("886");
		a.add("554");
		System.out.println("本次開獎號碼為：331,821,886,554;");
		Scanner scanner = new Scanner(System.in);
		System.out.println("請使用者輸入發票存根(長度不限)，判斷末三碼是否中獎：");
		String ss = scanner.nextLine();
		System.out.println(a);
		String deta = a.get(3);
		// int n = (int)a.get(4);
		Student stu = new Student();
		
	}

}
