package oo.stati;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		Student stud = new Student();
		System.out.println(stud);

		Student stu1 = new Student(58, 98, 66);
		Student stu2 = new Student(68, 84, 89);
		Student stu3 = new Student(75, 99, 59);
		GraduateStudent gts1 = new GraduateStudent(58, 98, 66);
		stu1.pass = 70;
		stu1.print();
		stu2.print();
		stu3.print();
		GraduateStudent gstu1 = new GraduateStudent(60, 50, 77);
		GraduateStudent gstu2 = new GraduateStudent(72, 53, 91);
		gstu1.print();
		gstu2.print();
		//
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(58, 98, 66));
		list.add(new Student(68, 84, 89));
		list.add(new Student(75, 99, 59));
		list.add(new GraduateStudent(60, 50, 77));
		list.add(new GraduateStudent(72, 53, 91));
		for (int i = 0; i < list.size(); i++) {
			Student stu = list.get(i);
			stu.print();
		}

	}

}
