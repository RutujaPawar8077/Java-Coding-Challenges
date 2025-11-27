package day10;

import java.util.Scanner;

public class LeftTrianglePattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int n = sc.nextInt();

		for (int p = 1; p <= n; p++) {

			for (int q = 1; q <= n - p; q++) {
				System.out.print(" ");
			}

			for (int r = 1; r <= p; r++) {
				System.out.print("*");
			}

			System.out.println();
		}
		sc.close();
	}
}
