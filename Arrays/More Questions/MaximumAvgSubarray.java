public class MaximumAvgSubarray {
    public static void main(String[] args) {
 int nums[] = { 1, 12, -5, -6, 50, 3 }, k = 3;
        System.out.println(silidingwindow(nums, k));
    }

    public static double silidingwindow(int arr[], int k) {
        int i = 0;
        int j = k - 1;
        int sum = 0;
        for (int j2 = i; j2 <= j; j2++) {
            sum = sum + arr[j2];
        }

        int maxSum = sum;

        j++;

        while (j < arr.length) {
            sum = sum - arr[i++];
            sum = sum + arr[j++];
            maxSum = Math.max(maxSum, sum);
        }
        double maxAvg = maxSum / (double) k;
        return maxAvg;
    }
}