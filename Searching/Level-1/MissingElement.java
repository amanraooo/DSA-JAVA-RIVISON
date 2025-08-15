import java.util.Arrays;

public class MissingElement {
    public static void main(String[] args) {
        // int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
        int nums[] = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };

        int result = find2(nums);
        System.out.println("missing number is " + result);
    }

    // only finds when array start from 1
    public static int find(int nums[]) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int diff = nums[mid] - mid;
            if (diff == 1) {
                start = mid + 1;
            } else {
                ans = mid;
                end = mid - 1;
            }
            if (ans + 1 == 0) {
                return nums.length + 1;
            }
        }
        return ans + 1;

    }

    // wroks when array start from 0 ...[leetcode]
    public static int find2(int nums[]) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == mid) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;

    }
}
