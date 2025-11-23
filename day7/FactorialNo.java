package day7;

import java.util.Scanner;

public class FactorialNo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a No: ");
		
		int num = sc.nextInt();
		 int fact=1;
		
		for(int i = 1; i<=num;i++) {
			fact = fact *i;
		}
		System.out.println("factorial of" + num  +" is :" +fact);
		sc.close();	
	}

}
