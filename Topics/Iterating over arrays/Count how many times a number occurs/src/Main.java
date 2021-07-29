import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        int[] array = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            array[i] = sc.nextInt();
        }

        int n = sc.nextInt();
        int result = 0;

        for (int i = 0; i < arrayLength; i++) {
            if (array[i] == n) {
                result++;
            }
        }

        System.out.println(result);


    }
}