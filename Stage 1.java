package processor;

import java.util.Scanner;
import java.util.Arrays;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int m1 = sc.nextInt();
		int n1 = sc.nextInt();
		int[][] arr1 = new int[m1][n1];
		for (int i = 0; i < m1; i++) {
			for (int j = 0; j < n1; j++) {
				arr1[i][j] = sc.nextInt();

			}
		}
		int m2 = sc.nextInt();
		int n2 = sc.nextInt();
		int[][] arr2 = new int[m2][n2];

		for (int i = 0; i < m2; i++) {
			for (int j = 0; j < n2; j++) {
				arr2[i][j] = sc.nextInt();

			}

		}
		if (m1 != m2 && n1 != n2) {
			System.out.println("ERROR");
		} else {
			int[][] sum = new int[m1][n1];
			for (int i = 0; i < m2; i++) {
				for (int j = 0; j < n2; j++) {
					sum[i][j] = arr1[i][j] + arr2[i][j];
					System.out.print(sum[i][j] + " ");

				}
				System.out.println();

			}

		}
	}
}

