public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60 };

        System.out.println("The reversed array: " + ReverseArr(arr, arr.length));
    }

    public static int[] ReverseArr(int arr[], int size) {
        int left = 0;
        int right = size - 1;
        while (left <= right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }
}
