public class FindTargetInRotatedSortedArr {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        System.out.println(search(arr, 0));
    }
    public static int search(int arr[], int target){
        int pivot = findPivot(arr);
        if(arr[0]<=target && target <=arr[pivot]){
           return BS(arr, target,0,pivot );
        }
        else{
          return  BS(arr, target,pivot+1 , arr.length-1);

        }
    }
    //finding pivot as largest
    public static int findPivot(int arr[]) {
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

    //binary search
    public static int BS(int nums[], int target, int start , int end) {

       

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target)
                return mid;

            else if (nums[mid] < target)
                start = mid + 1;

            else if (nums[mid] > target)
                end = mid - 1;

        }

        return -1;

    }
}
