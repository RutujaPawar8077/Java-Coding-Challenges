package day1;

import java.util.Scanner;

public class LargestOfTwo {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first No: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the second No: " );
		int num2 = sc.nextInt();
		
		if(num1>num2) {
			System.out.println(num1 +" is the largest number ");
		}else {
			System.out.println(num2 +" is the largest number ");
		}
		sc.close();
	}
}
