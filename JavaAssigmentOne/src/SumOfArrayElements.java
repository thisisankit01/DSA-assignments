public class SumOfArrayElements {
    public static void main(String[] args) {
        int[] arr = {1,2,6,3,5};
        int result = sum(arr);
        System.out.println(result);
    }
    public static int sum(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length ; i++) {
                result += arr[i];
        }
        return result;
    }
}
