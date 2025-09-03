import java.util.ArrayList;
import java.util.List;

public class FindClosestElement {
    public static void main(String[] args) {

        int arr[] = { 8, 9, 10, 11, 12, 13, 15, 16, 19 };
        List<Integer> result = twoPtrMetho(arr, 3, 12);
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
}
