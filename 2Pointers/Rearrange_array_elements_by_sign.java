public class Rearrange_array_elements_by_sign {
    public static void main(String[] args) {
        int[] nums = { 3, 1, -2, -5, 2, -4 };
        display(rearrange(nums));

        int[] nums1 = { -1, 1 };
        display(rearrange(nums1));

        int[] nums2 = { 1, 2, 3, 4, -1, -2, -3, -4 };
        display(rearrange(nums2));

        int[] nums3 = { 28, -41, 22, -8, -37, 46, 35, -9, 18, -6, 19, -26, -37, -10, -9, 15, 14, 31 };
        display(rearrange(nums3));
    }

    public static int[] rearrange(int arr[]) {
        int pos = 0;
        int neg = 1;

        int ans[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                ans[pos] = arr[i];
                pos += 2;
            } else {
                ans[neg] = arr[i];
                neg += 2;
            }
        }

        return ans;
    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
