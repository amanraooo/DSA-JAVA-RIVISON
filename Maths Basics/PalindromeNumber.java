
public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(1331));
        System.out.println(isPalindrome(123));

    }

    public static boolean isPalindrome(int n) {
        int reversed = reverse(n);
        if (n == reversed) {
            return true;
        }
        return false;
    }

    public static int reverse(int n) {
        int reversed = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            reversed = reversed * 10 + lastDigit;
            n = n / 10;
        }
        return reversed;
    }
    public static int reverse2(int n) {
        int reversed = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            reversed = reversed * 10 + lastDigit;
            n = n / 10;
        }
        return reversed;
    }
}
