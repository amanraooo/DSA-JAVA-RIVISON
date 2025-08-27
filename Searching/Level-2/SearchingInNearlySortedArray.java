public class SearchingInNearlySortedArray {
    public static void main(String[] args) {
        int arr[] = { 20, 10, 30, 50, 40, 70, 60 };
        int ans = search(arr, 70);
        if (ans == -1) {
            System.out.println("Element not Found");
        } else {
            System.out.println("Element found at index: " + ans);

        }
    }

    public static int search(int arr[], int target) {

        int n = arr.length - 1;
        int s = 0;
        int e = n;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (mid >= 0 && arr[mid - 1] == target) {
                return mid - 1;
            } else if (mid < n && arr[mid + 1] == target) {
                return mid + 1;
            } else if (target > mid) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }

        }
        return -1;
    }
}
