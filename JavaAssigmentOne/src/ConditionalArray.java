import java.util.ArrayList;
import java.util.Scanner;

public class ConditionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(returnAlgorithm(arr));
        scanner.close();
    }
    public static int returnAlgorithm(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                return arr[i];
            }
        }
        return -1;
    }
}
