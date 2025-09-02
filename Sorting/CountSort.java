public class CountSort {
    public static void main(String[] args) {
        int nums[] = { 5, 4, 1, 2, 0 };
        sort(nums);
        printArr(nums);

    }

    // sorts only +ve nums
    public static void sort(int nums[]) {

        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            largest = Math.max(largest, nums[i]);
        }

        int count[] = new int[largest + 1];

        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        int i = 0;
        int j = 0;
        while (i < count.length) {
            while (count[i]-- > 0) {
                nums[j] = i;
                j++;
            }
            i++;
        }

    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
