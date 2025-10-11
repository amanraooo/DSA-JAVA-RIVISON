import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
        // System.out.println(MJ1(nums));
        System.out.println(MJ2(nums));

    }

    // brute force approach O(n2)
    public static int MJ1(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count > n / 2) {
                return arr[i];
            }
        }
        return -1;
    }

    // optimized approach than brute force O(nlogn)
    public static int MJ2(int arr[]) {
        Arrays.sort(arr);
        int n = arr.length;
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
                if (count > n / 2) {
                    return arr[i];
                }
            } else {
                count = 1;
            }
        }
        return -1;
    }
}
