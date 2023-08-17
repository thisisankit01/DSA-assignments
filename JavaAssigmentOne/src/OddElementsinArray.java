import java.util.ArrayList;

public class OddElementsinArray {
    public static void main(String[] args) {
        int[] array = {1,5,6,4,3,2,8};
          oddElements(array);
    }
    public static void oddElements(int[] arr) {
        ArrayList<Integer> resultArray = new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] % 2 != 0) {
                resultArray.add(arr[i]);
            }
        }
        System.out.println(resultArray);
    }
}