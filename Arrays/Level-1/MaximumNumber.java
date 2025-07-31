public class MaximumNumber {
    public static void main(String[] args) {
        int arr[] = { 10, 3, 20, 44, 1, 4 };
        int size = arr.length;
        System.out.println("The max number is: " + MaxNum(arr, size));
    }

    public static int MaxNum(int arr[], int size) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
