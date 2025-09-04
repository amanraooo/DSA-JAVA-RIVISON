public class BookAllocationProblem {
    public static void main(String[] args) {
        int arr[] = { 12, 34, 67, 90 };
        int ans = bookAllocate(arr, arr.length, 2);
        System.out.println(ans);
    }

    public static int bookAllocate(int arr[], int n, int m) {
        if (m > n) {
            return -1;
        }

        int s = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }

        int e = sum;
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (isPossible(arr, n, m, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;

    }

    private static boolean isPossible(int[] arr, int n, int m, int mid) {
        int studentCount = 1;
        int pageSum = 0;
        for (int i = 0; i < n; i++) {
            if (pageSum + arr[i] <= mid) {
                pageSum = pageSum + arr[i];
            } else {
                studentCount++;
                if (studentCount > m || arr[i] > mid) {
                    return false;
                }
                pageSum = 0;
                pageSum += arr[i];
            }
        }
        return true;

    }
}
