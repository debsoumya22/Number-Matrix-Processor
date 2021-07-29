package processor;
import java.util.Scanner;

class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			System.out.println("1. Add matrices\r\n" + "2. Multiply matrix by a constant\r\n"
					+ "3. Multiply matrices\r\n" + "0. Exit");
			int choice = sc.nextInt();
			System.out.println("Your choice: >" + choice);
			switch (choice) {
			case 1:
				addMatrix();
				break;

			case 2:
				constantMultiplication();
				break;

			case 3:
				mulMultiplication();
				break;

			case 0:
				System.out.println("EXIT");
				System.exit(0);

			default:
				System.out.println("Enter correct value! ");

			}
		}
	}

	public static void addMatrix() {
		System.out.print("Enter size of first matrix: >");
		int m1 = sc.nextInt();
		int n1 = sc.nextInt();
		double[][] arr1 = new double[m1][n1];
		System.out.println("Enter first matrix:");
		for (int i = 0; i < m1; i++) {
			System.out.print(">");

			for (int j = 0; j < n1; j++) {

				arr1[i][j] = sc.nextDouble();

			}
		}

		System.out.println("Enter size of second matrix: >");

		int m2 = sc.nextInt();
		int n2 = sc.nextInt();
		if (m1 != m2 || n1 != n2) {
			System.out.println("ERROR \n");
		} else {
			double[][] arr2 = new double[m2][n2];
			System.out.println("Enter second matrix:");

			for (int i = 0; i < m2; i++) {
				System.out.print(">");

				for (int j = 0; j < n2; j++) {
					arr2[i][j] = sc.nextDouble();

				}

			}

			double[][] sum = new double[m1][n1];
			System.out.println("The result is:");

			for (int i = 0; i < m2; i++) {
				for (int j = 0; j < n2; j++) {
					sum[i][j] = arr1[i][j] + arr2[i][j];
					System.out.print(sum[i][j] + " ");

				}
				System.out.println();

			}
			System.out.println();
		}

	}

	public static void constantMultiplication() {
		System.out.print("Enter the size of matrix: >");
		int m2 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.println("Enter matrix: ");

		double[][] arr2 = new double[m2][n2];
		for (int i = 0; i < m2; i++) {
			System.out.print(">");

			for (int j = 0; j < n2; j++) {
				arr2[i][j] = sc.nextDouble();

			}

		}
		System.out.print("Enter the constant: > ");
		double mul = sc.nextDouble();
		System.out.println("The result is :");
		double[][] multiMatrix = new double[m2][n2];
		for (int i = 0; i < m2; i++) {
			for (int j = 0; j < n2; j++) {
				multiMatrix[i][j] = mul * arr2[i][j];
				System.out.print(multiMatrix[i][j] + " ");

			}
			System.out.println();

		}
		System.out.println();
	}

	public static void mulMultiplication() {
		System.out.println("Enter size of first matrix: >");
		int m1 = sc.nextInt();
		int n1 = sc.nextInt();
		double[][] arr1 = new double[m1][n1];
		System.out.println("Enter first matrix:");
		for (int i = 0; i < m1; i++) {
			System.out.print(">");

			for (int j = 0; j < n1; j++) {

				arr1[i][j] = sc.nextDouble();

			}
		}

		System.out.println("Enter size of second matrix: >");

		int m2 = sc.nextInt();
		int n2 = sc.nextInt();
		double[][] arr2 = new double[m2][n2];
		System.out.println("Enter second matrix:");

		for (int i = 0; i < m2; i++) {
			System.out.print(">");

			for (int j = 0; j < n2; j++) {
				arr2[i][j] = sc.nextDouble();

			}

		}
		System.out.println("The result is: ");
		double[][] multiMatrix = new double[m1][n2];
		if (n1 != m2) {
			System.out.println("The operation can't be performed! ");
		} else {

			for (int i = 0; i < m1; i++) {
				for (int j = 0; j < n2; j++) {
					for (int k = 0; k < m2; k++) {
						multiMatrix[i][j] += arr1[i][k] * arr2[k][j];
					}

				}

			}

			for (int i = 0; i < m1; i++) {
				for (int j = 0; j < n2; j++) {
					System.out.print(multiMatrix[i][j] + " ");

				}
				System.out.println();
			}
			System.out.println();

		}
	}
}




