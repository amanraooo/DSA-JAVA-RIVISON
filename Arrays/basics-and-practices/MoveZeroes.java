public class MoveZeroes {
    public static void main(String[] args) {
        int nums[] = { 0, 1, 0, 3, 12 };
        move(nums);
        int nums1[] = { 1, 0, 1 };
        move(nums1);
    }

    public static void move(int nums[]) {
        int pos =0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                nums[pos]=nums[i];
                pos++;
            }
        }

        while (pos<nums.length) {
            nums[pos]=0;
            pos++;
        }
        display(nums);

    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
