import java.util.Arrays;
import java.util.Scanner;

public class FindMaxOf3Elements {
    public static void main(String[] args) {
        Scanner inputOne = new Scanner(System.in);
        Scanner inputTwo = new Scanner(System.in);
        Scanner inputThree = new Scanner(System.in);

        maxAlgo(inputOne ,inputTwo , inputThree);

    }

    public static int maxAlgo(Scanner inputOne, Scanner inputTwo, Scanner inputThree) {

        System.out.println("Enter Number 1");
        int numberOne = inputOne.nextInt();

        System.out.println("Enter Number 2");
        int numberTwo = inputOne.nextInt();

        System.out.println("Enter Number 3");
        int numberThree = inputOne.nextInt();

        int[] arr = {numberOne, numberTwo, numberThree};
        Arrays.sort(arr);

        int result = arr[2];
        System.out.println("The max Number among all three is : " + result);

        return result;
    }
}
