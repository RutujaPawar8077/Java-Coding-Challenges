package day2;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a No: ");
		
		int num = sc.nextInt();
		System.out.println("multiplication table of :" +num);
		
		for(int i =1; i<=10; i++) {
			/* System.out.println(num*i); */
			System.out.println(num + " * " +i +" = "+(num*i));
		}
		sc.close();

	}

}
