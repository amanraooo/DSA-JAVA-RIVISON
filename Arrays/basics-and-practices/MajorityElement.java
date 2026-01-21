public class MajorityElement {
    public static void main(String[] args) {
        int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(majorityEle(nums));
        int nums2[] = { 3, 2, 3 };
        System.out.println(majorityEle(nums2));
    }

    public static int majorityEle(int nums[]) {
        int vote_Count = 0;
        int candidate = 0;
        for (int i = 0; i < nums.length; i++) {
            int curr_name = nums[i];

            if (vote_Count == 0) {
                candidate = curr_name;
            }
            if (curr_name != candidate) {
                vote_Count--;
            } else {
                vote_Count++;
            }
        }
        return candidate;
    }
}
