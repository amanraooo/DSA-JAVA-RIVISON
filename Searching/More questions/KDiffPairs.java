import java.util.Arrays;

public class KDiffPairs {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 1, 4, 5 };
        // int result= find(arr, 0);
        System.out.println("result " + find(arr, 0));
    }

    public static int find(int arr[], int k) {
        Arrays.sort(arr);

        int i = 0;
        int j = 1;
        int ans = 0;
        while (j < arr.length) {

            int diff = arr[j] - arr[i];

            if (diff == k) {
                ans++;
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
        return ans;
    }
}
