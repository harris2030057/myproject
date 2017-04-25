package oo.stati;

public class Student {
	int english;
	int math;
	int chinese;
	static int pass = 60;
	static{
		System.out.println("STATIC!");
		System.out.println("english");
		System.out.println("pass");
	}

	public Student(int english, int math, int chinese) {
		
		this.english = english;
		this.math = math;
		this.chinese = chinese;

	}

	public void print() {
		System.out.println(getScore(english) + "\t" + getScore(math) + "\t" + getScore(chinese) + "\t");
	}

	private String getScore(int score) {
		if (score < pass) {
			return String.valueOf(score) + "*";
		} else {
			return String.valueOf(score);
		}
	}

}
