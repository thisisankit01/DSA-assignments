class PrintUpsideRightTriangle {
    public static void main(String[] args) {
        rightTriangle(5);
    }
    public static void rightTriangle(int n) {
        for (int i = n; i > 0; i--) { // Fix 1: Changed loop condition
            for (int j = 1; j <= i; j++) { // Fix 2: Changed loop condition and starting value of j
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
