import java.util.Arrays;

public class AggrassiveCowsProblem {
    public static void main(String[] args) {
        int stalls[] = { 4, 2, 1, 3, 6 };
        int result = aggressiveCows(stalls, 2);
        System.out.println(result);
    }

    public static int aggressiveCows(int arr[], int k) {
        Arrays.sort(arr);
        int s = 0;
        int n = arr.length;
        int e = arr[n - 1];

        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isPossible(arr, k, mid, n)) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int[] arr, int k, int mid, int n) {
        int cowcount = 1;
        int lastPos = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] - lastPos >= mid) {
                cowcount++;
                if (cowcount == k) {
                    return true;
                }
                lastPos = arr[i];

            }
        }
        return false;
    }
}
