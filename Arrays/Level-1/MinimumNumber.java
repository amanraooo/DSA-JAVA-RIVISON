public class MinimumNumber {
    public static void main(String[] args) {
        int arr[] = { 10, 3, 20, 44, 1, 4 };
        int size = arr.length;
        System.out.println("The min number is: " + MinNum(arr, size));
    }

    public static int MinNum(int arr[], int size) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
