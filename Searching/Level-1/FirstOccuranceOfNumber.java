public class FirstOccuranceOfNumber {
    public static void main(String[] args) {
        int nums[] = { 10, 20, 20, 20, 30, 40, 50, 60, 70, 80, 90 };
        int result = FO(nums, 20);
        System.out.println("The first occurance of is at " + result);
    }

    public static int FO(int nums[], int target) {
        int start = 0;
        int end = nums.length - 1;
        int found = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                found = mid;
                end = mid - 1;

            } else if (nums[mid] < target)
                start = mid + 1;

            else if (nums[mid] > target)
                end = mid - 1;
        }
        return found;

    }
}
