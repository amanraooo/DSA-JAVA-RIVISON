public class LCM_GCD {
    public static void main(String[] args) {
        int a = 12;
        int b = 18;
        int gcd = Findgcd(a, b);
        int lcm = (a * b) / gcd;
        System.out.println("GCD " + gcd);
        System.out.println("LCM " + lcm);

    }

    public static int Findgcd(int a, int b) {
        int gcd = 1;
        int min = Math.min(a, b);

        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
