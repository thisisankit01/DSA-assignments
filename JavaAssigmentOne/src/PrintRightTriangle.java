public class PrintRightTriangle {
    public static void main(String[] args) {
         rightTriangle(4);
    }
    public static void rightTriangle (int n) {
        for (int i = 0 ; i <= n; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
    }
}
