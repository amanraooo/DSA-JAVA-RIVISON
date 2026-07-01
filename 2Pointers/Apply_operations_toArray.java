public class Apply_operations_toArray {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 2, 1, 1, 0 };
        int nums1[] = { 0, 1 };

        display(applyOperations(nums));
        System.out.println();
        display(applyOperations(nums1));
    }

    public static int[] applyOperations(int[] arr) {
        int i = 0;
        int j = i + 1;

        while (i <= arr.length - 2) {
            if (arr[i] == arr[j]) {
                arr[i] = arr[i] * 2;
                arr[j] = 0;
                i++;
                j++;

            } else {
                i++;
                j++;
            }
        }
        return move(arr);
    }

    public static int[] move(int nums[]) {
        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[pos] = nums[i];
                pos++;
            }
        }

        while (pos < nums.length) {
            nums[pos] = 0;
            pos++;
        }
        return nums;

    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
