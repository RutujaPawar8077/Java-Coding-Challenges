package day11;

import java.util.Scanner;

public class ReversedPyramid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size:");
		int n=sc.nextInt();
		for(int p=n; p>=1; p--) {

            for(int q=n; q>p; q--) {
                System.out.print(" ");
            }

            for(int r=1; r<=p; r++) {
                System.out.print(" *");
            }
            System.out.println();
        }
		sc.close();
	}

}
