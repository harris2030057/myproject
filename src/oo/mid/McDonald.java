package oo.mid;

import java.util.Scanner;

public class McDonald {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("請輸入您需要的餐點編號 :");
String s  = scanner.nextLine();
System.out.println(s);
float w  = Float.parseFloat(s);
if(w==1){
	System.out.println("");
}
if(w<=0 || w>5){
	System.out.println("輸入錯誤請從新輸入");
return;

}


	}

}
