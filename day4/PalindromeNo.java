package day4;

import java.util.Scanner;

public class PalindromeNo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a No: ");
		int num = sc.nextInt();
		
		int duplicate = num;         //original no
		int rev=0;                   //reverse no
		
		while(num>0) {
			int rem = num%10;           
			rev = rev*10+rem;
			num = num/10;
		}
		
		if(duplicate == rev) {           //compare no
			System.out.println(duplicate+ " is palindrome no");
		}else {
			System.out.println(duplicate+ " is not palindrome no");
		}
		sc.close();
	}

}
