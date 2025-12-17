import java.util.Arrays;

public class Threesum {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        //ThreeSum(arr, 12);
        int arr2[] = { -1,0,1,2,-1,-4 };
        ThreeSum(arr2, 0);


    }

    public static void ThreeSum(int arr[], int target) {
     Arrays.sort(arr);
        for (int anchor = 0; anchor < arr.length - 2; anchor++) {
if (anchor > 0 && arr[anchor] == arr[anchor - 1])
                continue;
            int l = anchor + 1;
            int h = arr.length - 1;
            while (l < h) {
                int twosum = arr[l] + arr[h];
                int threesum = arr[anchor] + twosum;
                if (threesum == target) {
                    System.out.println(arr[anchor] + " , " + arr[l] + " , " + arr[h]);
                    l++;
                    h--;
                    while (l < h && arr[l] == arr[l - 1]) l++;
                    while (l < h && arr[h] == arr[h + 1]) h--;
                } else if (threesum > target)
                    h--;

                else if (threesum < target)
                    l++;

            }

        }

    }
}
