public class Sqrt {
    public static void main(String[] args) {
        System.out.println(SquareRoot(68));
    }

    public static int SquareRoot(int x) {
        int s = 0;
        int e = x;
        int ans = -1;
        while (s <= e) {
            long mid = s + (e - s) / 2;
            if (mid * mid == x)
                return (int) mid;
            else if (mid * mid < x) {
                ans = (int) mid;
                s = (int) mid + 1;
            } else {
                e = (int) mid - 1;
            }
        }
        return ans;
    }
}
