public class SortZeroesAndOnes {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 0, 1, 1 };
        sort2(arr, arr.length);
        printArr(arr);
    }

    // 2 pointer approach
    public static int[] sort2(int arr[], int size) {
        int left = 0;
        int right = size - 1;
        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            if (arr[left] == 0)
                left++;
            if (arr[right] == 1)
                right--;
        }
        return arr;

    }

    // counter apporach
    public static void sort(int arr[], int size) {
        int zeroes = 0;
        int ones = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] == 0) {
                zeroes++;
            } else if (arr[i] == 1) {
                ones++;
            }
        }
        int i = 0;
        while (zeroes-- > 0) {
            arr[i] = 0;
            i++;
        }

        while (ones-- > 0) {
            arr[i] = 1;
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
