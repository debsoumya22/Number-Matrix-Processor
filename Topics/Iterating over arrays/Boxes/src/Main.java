import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        for (int i = 0; i < 3; i++) {
            arr1[i] = scanner.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            arr2[i] = scanner.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (arr1[0] > arr2[0] && arr1[1] > arr2[1] && arr1[2] > arr2[2]) {
            System.out.println("Box 1 > Box 2");
        } else if (arr1[0] < arr2[0] && arr1[1] < arr2[1] && arr1[2] < arr2[2]) {
            System.out.println("Box 1 < Box 2");
        } else {
            System.out.println("Incompatible");
        }
    }
}
