public class main4 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int i, a;
        for (a = 1; a <= 5; a++) {
            for (i = 5; i >= a; i--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
