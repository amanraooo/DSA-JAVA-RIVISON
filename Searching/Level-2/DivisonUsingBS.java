public class DivisonUsingBS {
    public static void main(String[] args) {
        int Divisor = 7;
        int Dividend = -31;

        int ans = find(Math.abs(Divisor), Math.abs(Dividend));
        
        if ((Divisor > 0 && Dividend < 0) || (Divisor < 0 && Dividend > 0)) {
            ans = 0 - ans;
        }
        System.out.println("Ans: " + ans);
    }

    public static int find(int Divisor, int Dividend) {
        int s = 0;
        int e = Dividend;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid * Divisor == Dividend) {
                return mid;
            }
            if (mid * Divisor > Dividend) {
                e = mid - 1;
            } else {
                ans = mid;
                s = mid + 1;
            }
        }

        return ans;
    }
}
