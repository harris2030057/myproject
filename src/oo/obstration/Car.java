package oo.obstration;

public class Car {
	String brand;
	int cc;
	String name;
	String type;
	int id;
	int status;
	float milage;
	
public Car(String brand, String name){
	this.brand = brand;
	this.cc = cc;
	this.name = name;
	this.type = type;
	this.id = id;
	this.status = status;
	this.milage = milage;
	
}
	public Car(String brand, int cc, String name, String type) {
		this.brand = brand;
		this.cc = cc;
		this.name = name;
		this.type = type;
		int status;
int s ;

	}
 public void maintain(){
	 status = 5;
	 
 }
 public void setMilage(int m){
	 milage = m;
 }
 
 public float addMilage(int m){
	 milage = milage + m ;
	 return milage;
	 
	 
 }
}
