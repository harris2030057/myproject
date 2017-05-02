package oo.stati;

public class Tester {

	public static void main(String[] args) {

		Student stu1 = new Student(58, 98, 66);
		Student stu2 = new Student(67, 56, 77);
		Student stu3 = new Student(75, 99, 59);
		GraduateStudent gts1 = new GraduateStudent(58, 98, 66);
		stu1.pass = 70;
		stu1.print();
		stu2.print();
		stu3.print();
		GraduateStudent gstu= new GraduateStudent(60, 50, 77);
		gstu.print();
	};
}
