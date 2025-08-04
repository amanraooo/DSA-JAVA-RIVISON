
public class SortNegAndPos {
    public static void main(String[] args) {
        int arr[] = { 23, -7, 12, -10, -1, 60 };
        sort(arr, arr.length);
        printArr(arr);
    }

    public static int[] sort(int arr[], int size) {
        int left = 0;
        int right = size - 1;
        while (left < right) {
            if (arr[left] > 0 && arr[right] < 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            if (arr[left] < 0)
                left++;
            if (arr[right] > 0)
                right--;
        }
        return arr;

    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
