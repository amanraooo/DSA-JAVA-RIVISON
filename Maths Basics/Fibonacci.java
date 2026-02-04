public class Fibonacci {
    public static void main(String[] args) {
        fibbonacciseries(5);
        fibbonacciseries(6);
        fibbonacciseries(15);
        fibbonacciseries(20);
        fibbonacciseries(25);

    }

    public static void fibbonacciseries(int n) {
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");

        while (true) {
            int next = a + b;
            if (next > n) {
                break;
            }
            System.out.print(next + " ");
            a = b;
            b = next;
        }
        System.out.println();
    }
}
