package day2;

import java.util.Scanner;

public class PositiveNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a No: ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println(num +" is positive");
		}else if(num < 0) {
			System.out.println(num +" is negative");
		}else {
			System.out.println(" No is zero");
		}
		sc.close();

	}

}
