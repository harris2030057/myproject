package oo.shopping;

public class SilverCustomer extends Customer {
	
	public SilverCustomer(int total){
		super(total);
	}
float discount = 0.1f ;
public void print() {
	System.out.println(total + "\t" + (total * discount)+"\t0" );
}

}
