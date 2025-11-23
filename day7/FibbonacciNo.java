package day7;

import java.util.Scanner;

public class FibbonacciNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter choice you want to print fibbonacci Series: ");
		int num = sc.nextInt();
		
		int a = 0;  int b= 1;
		
		for(int i = 1; i<=num; i++) {
			System.out.println(a+ " ");
			int sum = a+b;
			a=b;
			b=sum;
		}	
		sc.close();
	}
	

}
