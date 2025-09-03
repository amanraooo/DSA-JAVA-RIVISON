import java.util.Arrays;
import java.util.HashSet;

public class KDiffPairs {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 1, 4, 5 };
        // int result= find(arr, 0);
        //System.out.println("result " + find(arr, 0));
        System.out.println("result " + findPairs(arr, 0));

    }

    // binary search apparoach
    public static int findPairs(int arr[], int k) {
        return BSApproach(arr,k);
    }

    public static int BSApproach(int arr[], int k) {
        Arrays.sort(arr);
        HashSet<String> ans = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (bs(arr, i + 1, arr[i] + k) != -1) {
                ans.add(arr[i] + " , " + arr[i] + k);
            }
        }
        return ans.size();

    }

    public static int bs(int nums[], int start, int target) {

        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    // two pointer aproach
    public static int find(int arr[], int k) {
        Arrays.sort(arr);

        int i = 0;
        int j = 1;

        HashSet<String> ans = new HashSet<>();
        while (j < arr.length) {

            int diff = arr[j] - arr[i];

            if (diff == k) {
                ans.add(arr[i] + ", " + arr[j]);
                i++;
                j++;
            } else if (diff > k) {
                i++;
            } else {
                j++;
            }
            if (i == j) {
                j++;
            }
        }
        return ans.size();
    }
}
