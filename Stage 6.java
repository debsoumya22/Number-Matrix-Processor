import java.math.BigDecimal;
import java.util.Scanner;

class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			System.out
					.println("1. Add matrices\r\n" + "2. Multiply matrix by a constant\r\n" + "3. Multiply matrices\r\n"
							+ "4. Transpose matrix\r\n" + "5. Calculate a determinant\r\n"+"6. Inverse matrix\r\n" + "0. Exit");
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
			case 4:
				transposeMatrix();
				break;
			case 5:
				detMatrix();
				break;
			case 6:
				doInverseMatrix();
				break;

			case 0:
				System.out.println("EXIT");
				System.exit(0);

			default:
				System.out.println("Enter correct value! ");

			}
		}
	}

	private static void doInverseMatrix() {
		System.out.print("Enter matrix size: ");
		int m0 = sc.nextInt();
		int n0 = sc.nextInt();
		double[][] arr0 = new double[m0][n0];
		System.out.println("Enter matrix:");
		for (int i = 0; i < m0; i++) {
			System.out.print(">");

			for (int j = 0; j < n0; j++) {

				arr0[i][j] = sc.nextDouble();

			}
		}
		double[][] inverse = new double[m0][n0];
		

		for (int i = 0; i < m0; i++)
			for (int j = 0; j < n0; j++)
				inverse[i][j] = Math.pow(-1, i + j) * determinant(minor(arr0, i, j));

		// adjugate and determinant
		
		double det = 1 / determinant(arr0) ;

		for (int i = 0; i < inverse.length; i++) {
			for (int j = 0; j <= i; j++) {
				double temp = inverse[i][j];
				inverse[i][j] = inverse[j][i] * det;
				inverse[j][i] = temp * det;
			}
		}
		System.out.println("The result is: ");
		for (int i = 0; i < m0; i++) {

			for (int j = 0; j < n0; j++) {

				System.out.print(inverse[i][j] + " ");
			}

			System.out.println();
		}
		System.out.println();

	}

	private static double[][] minor(double[][] matrix, int row, int column) {
		double[][] minor = new double[matrix.length - 1][matrix.length - 1];

		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; i != row && j < matrix[i].length; j++)
				if (j != column)
					minor[i < row ? i : i - 1][j < column ? j : j - 1] = matrix[i][j];
		return minor;
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

	public static void transposeMatrix() {
		System.out.println(
				"1. Main diagonal\r\n" + "2. Side diagonal\r\n" + "3. Vertical line\r\n" + "4. Horizontal line");
		int option = sc.nextInt();
		System.out.println("Your choice: " + option);
		switch (option) {
		case 1:
			System.out.print("Enter matrix size :");
			int m1 = sc.nextInt();
			int n1 = sc.nextInt();
			System.out.println("Enter matrix: ");
			double[][] arr = new double[m1][n1];
			for (int i = 0; i < m1; i++) {
				System.out.print(">");
				for (int j = 0; j < n1; j++) {
					arr[i][j] = sc.nextDouble();
				}
			}
			System.out.println("The result is: ");
			for (int i = 0; i < m1; i++) {
				for (int j = 0; j < n1; j++) {
					System.out.print(arr[j][i] + " ");

				}
				System.out.println();
			}
			System.out.println();
			break;
		case 2:
			System.out.print("Enter matrix size :");
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
			System.out.println("The result is: ");

			double[][] sideDiagonal = new double[m2][n2];
			for (int i = 0; i < m2; i++) {
				for (int j = 0; j < n2; j++) {
					sideDiagonal[i][j] = arr2[n2 - 1 - j][n2 - 1 - i];
					System.out.print(sideDiagonal[i][j] + " ");
				}
				System.out.println();

			}
			System.out.println();
			break;
		case 3:
			System.out.print("Enter matrix size :");
			int m3 = sc.nextInt();
			int n3 = sc.nextInt();
			System.out.println("Enter matrix: ");
			double[][] arr3 = new double[m3][n3];
			for (int i = 0; i < m3; i++) {
				System.out.print(">");
				for (int j = 0; j < n3; j++) {
					arr3[i][j] = sc.nextDouble();
				}
			}
			System.out.println("The result is: ");
			double[][] verticalLine = new double[m3][n3];
			for (int i = 0; i < m3; i++) {
				for (int j = 0; j < n3; j++) {
					verticalLine[i][j] = arr3[i][n3 - 1 - j];
					System.out.print(verticalLine[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println();
			break;
		case 4:
			System.out.print("Enter matrix size :");
			int m4 = sc.nextInt();
			int n4 = sc.nextInt();
			System.out.println("Enter matrix: ");
			double[][] arr4 = new double[m4][n4];
			for (int i = 0; i < m4; i++) {
				System.out.print(">");
				for (int j = 0; j < n4; j++) {
					arr4[i][j] = sc.nextDouble();
				}
			}
			System.out.println("The result is: ");
			double[][] horizontalLine = new double[m4][n4];
			for (int i = 0; i < m4; i++) {
				for (int j = 0; j < n4; j++) {
					horizontalLine[i][j] = arr4[n4 - 1 - i][j];
					System.out.print(horizontalLine[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println();
			break;

		default:
			System.out.println("Enter correct option!");
		}
	}

	public static void detMatrix() {

		System.out.print("Enter matrix size :");
		int m5 = sc.nextInt();
		int n5 = sc.nextInt();
		if (m5 != n5) {
			System.out.println("Operation cannot be performed!");
		}
		System.out.println("Enter matrix: ");
		double[][] array = new double[m5][n5];
		for (int i = 0; i < m5; i++) {
			System.out.print(">");
			for (int j = 0; j < n5; j++) {
				array[i][j] = sc.nextDouble();
			}
		}
		System.out.println("The result is: ");
		System.out.println(determinant(array));
		System.out.println();

	}

	public static double determinant(double[][] arr) {
		double result = 0;
		if (arr.length == 1) {
			result = arr[0][0];
			return result;
		}
		if (arr.length == 2) {
			result = arr[0][0] * arr[1][1] - arr[0][1] * arr[1][0];
			return result;
		}
		for (int i = 0; i < arr.length; i++) {
			double[][] minor = new double[arr.length - 1][arr[0].length - 1];

			for (int j = 1; j < arr.length; j++) {
				for (int k = 0; k < arr.length; k++) {
					if (k < i) {
						minor[j - 1][k] = arr[j][k];

					} else if (k > i) {
						minor[j - 1][k - 1] = arr[j][k];
					}

				}
			}
			result += arr[0][i] * Math.pow(-1, (int) i) * determinant(minor);
		}
		return result;

	}

}
