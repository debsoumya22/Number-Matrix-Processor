package processor;


import java.util.Scanner;

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

		int mul = sc.nextInt();
		int[][] multiMatrix = new int[m1][n1];
		for (int i = 0; i < m1; i++) {
			for (int j = 0; j < n1; j++) {
				multiMatrix[i][j] = mul*arr1[i][j];
				System.out.print(multiMatrix[i][j] + " ");

			}
			System.out.println();

		}

	}
}



