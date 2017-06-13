package oo.Test;

public class PhoneMember extends Member {
	String phone;
	boolean varified = false;

	public PhoneMember(String name) {
		super();

	}

	public PhoneMember() {
		super();
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public boolean isVarified() {
		return varified;
	}

	public void setVarified(boolean varified) {
		this.varified = varified;
	}

}
