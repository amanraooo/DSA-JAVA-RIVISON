public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int nums[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 3, 4, 4 };
        System.out.println(result(nums));
    }

    public static int result(int nums[]) {
        int index = 1;
        int unique = 0;
        int n = nums.length - 1;

        while (index <= n) {
            if (nums[unique] == nums[index])
                index++;
            else {
                unique++;
                nums[unique] = nums[index];
                index++;
            }
        }
        return unique + 1;

    }
}
