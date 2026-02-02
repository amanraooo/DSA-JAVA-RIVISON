
public class DivisorsOfNum {
    public static void main(String[] args) {
        divisor(12);
        divisor(36);

    }

    public static void divisor(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
