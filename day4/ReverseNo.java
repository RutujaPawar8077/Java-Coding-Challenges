package day4;

import java.util.Scanner;

public class ReverseNo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a No: ");
		
		int num = sc.nextInt();
		int rev=0;
		
		while(num>0) {                             //num=112
			int rem = num%10;     //last digit      rem= 112%10=2 
			rev = rev*10+rem;     //reverse         rev= 0*10+2= 2
			num = num/10;     //remove last digit   num = 112/10=11
		}
		System.out.println("Reverse No: "+rev);
		
		sc.close();
	}

}
