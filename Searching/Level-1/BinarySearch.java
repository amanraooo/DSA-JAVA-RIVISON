
public class BinarySearch {
    public static void main(String[] args) {
        int nums[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
        int result = BS(nums, 70);
        if (result == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Target found at: " + result);
        }
    }

    public static int BS(int nums[], int target) {

        int start = 0;
        int end = nums.length - 1;

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
