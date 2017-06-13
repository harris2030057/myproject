package oo.Test;

public class Member {
	String id;
	private int age;
	String name;

	 void setAge(int age) {
		if (age < 0) {
			age = 0;
		}
		this.age = age;
	}

	public int getAge() {
		return age;

	}
}
