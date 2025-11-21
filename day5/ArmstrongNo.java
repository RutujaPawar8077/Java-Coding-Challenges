package day5;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		
		int originalNo=num;
		int sum=0;
		
		while(num>0) {												//num=153
			int rem = num%10;          //last digit         		//rem=153%10=3
			sum = sum+(rem*rem*rem);  //cube                       	//sum=0+(3*3*3)=27
			num=num/10;               //remove last digit     		//num=153/10=15
		}
		
		if(originalNo==sum) {
			System.out.println(originalNo +" is Armstrong No");
		}else {
			System.out.println(originalNo +" is Not Armstrong No");
		}
	
		sc.close();
	}
}
