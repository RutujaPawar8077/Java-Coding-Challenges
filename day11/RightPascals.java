package day11;

import java.util.Scanner;

public class RightPascals {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size:");
		int n = sc.nextInt();
		for (int p = 1; p <= n; p++) {
			for (int q = 1; q <= p; q++) {
				System.out.print("*");
			}
			System.out.println();

		}
		for(int p=n-1; p>=1; p--) {
			for(int q=1; q<=p; q++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

	}


