import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Threesum {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        //ThreeSum(arr, 12);
        int arr2[] = { -1,0,1,2,-1,-4 };
        //ThreeSum(arr2, 0);
         System.out.println(threeSum(arr2));


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
    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int anchor = 0; anchor < nums.length - 2; anchor++) {

            if (anchor > 0 && nums[anchor] == nums[anchor - 1])
                continue;

            int l = anchor + 1;
            int h = nums.length - 1;

            while (l < h) {

                int sum = nums[anchor] + nums[l] + nums[h];

                if (sum == 0) {

                    result.add(Arrays.asList(nums[anchor], nums[l], nums[h]));

                    l++;
                    h--;

                    while (l < h && nums[l] == nums[l - 1]) l++;
                    while (l < h && nums[h] == nums[h + 1]) h--;

                } else if (sum < 0) {
                    l++;
                } else {
                    h--;
                }
            }
        }

        return result;
    }
}
