package oo.mid;

import java.util.Scanner;

public class McDonald {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("�п�J�z�ݭn���\�I�s�� :");
String s  = scanner.nextLine();
System.out.println(s);
float w  = Float.parseFloat(s);
if(w==1){
	System.out.println("");
}
if(w<=0 || w>5){
	System.out.println("��J���~�бq�s��J");
return;

}


	}

}
