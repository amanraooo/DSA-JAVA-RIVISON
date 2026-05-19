import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Three_Sum {

    public static void main(String[] args) {

        int[] nums = {-1,0,1,2,-1,-4};

        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int anchor = 0; anchor < nums.length - 2; anchor++) {

            if (anchor > 0 && nums[anchor] == nums[anchor - 1]) {
                continue;
            }

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