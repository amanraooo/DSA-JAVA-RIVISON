
public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(isArmstrong(1634));
        System.out.println(isArmstrong(533));

    }

    public static boolean isArmstrong(int n) {
        int og = n;
        int power = countdigits(n);
        int sum = 0;

        while (n > 0) {
            int digitPower = 1;
            int lastDigit = n % 10;

            for (int index = 1; index <= power; index++) {
                digitPower = digitPower * lastDigit;
            }

            sum = sum + digitPower;
            n = n / 10;

        }
        
        if (sum == og) {
            return true;
        }
        return false;

    }

    public static int countdigits(int n) {
        int count = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            count++;
            n = n / 10;
        }
        return count;
    }
}
