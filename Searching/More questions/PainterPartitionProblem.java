public class PainterPartitionProblem {
    public static void main(String[] args) {
        int boards[] = { 5, 5, 5, 5 };
        int result = findLargestMinDistance(boards, 2);
        System.out.println(result);
    }

    public static int findLargestMinDistance(int arr[], int m) {
        int s = 0;
        int sum = 0;

        for (int index = 0; index < arr.length; index++) {
            sum += arr[index];
        }

        int e = sum;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isPossible(arr, m, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int[] arr, int m, int mid) {
        int painterCount = 1;
        int paintSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (paintSum + arr[i] <= mid) {
                paintSum += arr[i];
            } else {
                painterCount++;
                if (painterCount > m || arr[i] > mid) {
                    return false;
                }
            }
            paintSum = 0;
            paintSum += arr[i];
        }
        return true;
    }
}
