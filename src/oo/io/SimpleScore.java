package oo.io;

import java.util.Scanner;

public class SimpleScore {

	public static void main(String[] args) {
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
			for(int i= 0;i<3;i++){
				System.out.print("�п�J���Z:");
				String data = scanner.nextLine();
				try{
					int score = Integer.parseInt(data);
					sum = sum + score;
				}catch(NumberFormatException e){
					System.out.println("���Z���ŦX�W�w");
					i--;
				}
			}
		System.out.println(sum);
	    
		//FileOutputStream fos = new FileOutputStream("data.txt");
	}

}
