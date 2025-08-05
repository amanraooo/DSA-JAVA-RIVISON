import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 15 };
        System.out.println(twoSum(arr, arr.length, 9));
    }

    public static boolean twoSum(int arr[], int n, int target) {
        Arrays.sort(arr);
        int l = 0;
        int r = n-1;
        while (l <= r) {
            if (arr[l] + arr[r] == target) {
                return true;
            } else if (arr[l] + arr[r] < target) {
                l++;
            } else {
                r--;
            }
        }
        return false;

    }
}
