public class Partition_arr_accTo_Pivot {
    public static void main(String[] args) {
        int nums[] = { 9, 12, 5, 10, 14, 3, 10 };
        int pivot = 10;
        display(pivotArray(nums, pivot));

        System.out.println();

        int nums1[] = { -3, 4, 3, 2 };
        int pivot1 = 2;
        display(pivotArray(nums1, pivot1));

    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] pivotArray(int[] nums, int pivot) {

        int ans[] = new int[nums.length];

        int idx = 0;
        for (int i : nums) {
            if (i < pivot) {
                ans[idx] = i;
                idx++;
            }
        }

        for (int i : nums) {
            if (i == pivot) {
                ans[idx] = i;
                idx++;
            }
        }

        for (int i : nums) {
            if (i > pivot) {
                ans[idx] = i;
                idx++;
            }
        }

        return ans;

    }
}
