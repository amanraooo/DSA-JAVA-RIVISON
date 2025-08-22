public class FindPivotInRotatedSortedArr {
    public static void main(String[] args) {
        int arr[] = { 0, 1 };
        //System.out.println("largest pivot index: " + findAsLargest(arr));
        System.out.println("smallest pivot index: " + findAsSmallest(arr));

    }

    public static int findAsLargest(int arr[]) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            // corner case
            if (s == e) {
                // single element
                return s;
            }

            if (mid < n-1 && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (mid > 0 && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            } else if (arr[s] > arr[mid]) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }

        }
        return -1;

    }
     public static int findAsSmallest(int arr[]) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            // corner case
             // if array is already sorted
        if (arr[s] <= arr[e]) {
            return s;
        }

            if (mid < n-1 && arr[mid] > arr[mid + 1]) {
                return mid+1;
            } else if (mid > 0 && arr[mid] < arr[mid - 1]) {
                return mid ;
            } else if (arr[s] > arr[mid]) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }

        }
        return -1;

    }
}