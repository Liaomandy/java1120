public class main6 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int i, a;
        for (a = 1; a <= 9; a++) {
            System.out.print("\n");
            for (i = 1; i <= 9; i++) {
                System.out.printf("%d*%d=%d", a, i, a * i);
            }
            System.out.print("\n");
        }
    }
}