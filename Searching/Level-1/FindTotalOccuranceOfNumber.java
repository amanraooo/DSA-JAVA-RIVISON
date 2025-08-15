public class FindTotalOccuranceOfNumber {
    public static void main(String[] args) {
        int nums[] = { 10, 20, 20, 20, 30, 40, 50, 60, 70, 80, 90 };
        int result = FindTotalOccurence(nums, 20);
        System.out.println("The Total occurance  is  " + result);

    }

    public static int FindTotalOccurence(int nums[], int target) {
        int firstOcc = FO(nums, target);
        int lastOcc = LO(nums, target);
        int totalOcc = lastOcc - firstOcc / 2;
        return totalOcc;

    }

    public static int LO(int nums[], int target) {
        int start = 0;
        int end = nums.length - 1;
        int found = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                found = mid;
                start = mid + 1;

            } else if (nums[mid] < target)
                start = mid + 1;

            else if (nums[mid] > target)
                end = mid - 1;
        }
        return found;

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
