
public class FactorialOfNumber {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(4));

    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = n; i > 0; i--) {
            fact = fact * i;
        }
        return fact;
    }
}
