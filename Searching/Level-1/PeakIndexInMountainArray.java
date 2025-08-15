
public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int nums[] = { 0, 1, 2, 3, 4, 2, 1, 0 };
        int result = peakIndex(nums);

        System.out.println("the peak index is " + result);
    }

    public static int peakIndex(int nums[]) {
        int n = nums.length - 1;
        int start = 0;
        int end = n;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < nums[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}
