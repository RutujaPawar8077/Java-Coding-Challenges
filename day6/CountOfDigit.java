package day6;

import java.util.Scanner;

public class CountOfDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int count = 0;
       
        
        while(num > 0) {
            count++;
            num = num/10;
        }
        
        System.out.println("Count of Digit: " + count);
        
        sc.close();
	}

}
