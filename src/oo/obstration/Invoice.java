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
		System.out.println("�����}�����X���G331,821,886,554;");
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ШϥΪ̿�J�o���s��(���פ���)�A�P�_���T�X�O�_�����G");
		String ss = scanner.nextLine();
		System.out.println(a);
		String deta = a.get(3);
		// int n = (int)a.get(4);
		Student stu = new Student();
		
	}

}
