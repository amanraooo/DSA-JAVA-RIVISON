public class ExponentialSearch {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22 };
        int result = search(arr, 22);
        System.out.println(result);
    }

    public static int search(int arr[], int x) {
        int n = arr.length;

        if (arr[0] == x)
            return 0;

        int i = 1;
        while (i < n && arr[i] <= x) {
            i = i * 2;

        }
        return BS(arr, (i / 2), Math.min(i, n - 1), x);
    }

    public static int BS(int nums[], int start, int end, int x) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == x)
                return mid;

            else if (nums[mid] < x)
                start = mid + 1;

            else if (nums[mid] > x)
                end = mid - 1;

        }

        return -1;

    }
}
