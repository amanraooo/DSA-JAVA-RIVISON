import java.util.ArrayList;
import java.util.List;

public class FindClosestElement {
    public static void main(String[] args) {

        int arr[] = { 8, 9, 10, 11, 12, 13, 15, 16, 19 };
        int arr1[] = { 2, 4, 6, 8, 10 };

        // List<Integer> result = twoPtrMetho(arr, 3, 12);
        List<Integer> result = bsMethod(arr1, 3, 5);

        System.out.println(result);
    }

    // 2 pointer approach
    public static List<Integer> twoPtrMetho(int arr[], int k, int x) {
        int l = 0;
        int h = arr.length - 1;
        while (h - l >= k) {
            if (x - arr[l] > arr[h] - x) {
                l++;
            } else {
                h--;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = l; i <= h; i++) {
            ans.add(arr[i]);
        }
        return ans;
    }

    // optimal solution with binary search
    public static List<Integer> bsMethod(int arr[], int k, int x) {
        int h = lowerbound(arr, x);
        int l = h - 1;

        while (k-- > 0) {
            if (l < 0) {
                h++;
            } else if (h >= arr.length) {
                l--;
            } else if (x - arr[l] > arr[h] - x) {
                h++;

            } else {
                l--;

            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int index = l + 1; index < h; index++) {
            ans.add(arr[index]);
        }

        return ans;
    }

    private static int lowerbound(int[] arr, int x) {
        int s = 0;
        int e = arr.length;
        int ans = e;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] >= x) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }
}
