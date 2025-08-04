public class SortColors {
    public static void main(String[] args) {
        int arr[] = { 1, 0, 0, 2, 1, 0 };
        sort(arr, arr.length);
        printArr(arr);
    }

    // counting approach
    public static void sort2(int arr[], int size) {
        int zeroes = 0;
        int ones = 0;
        int twos = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == 0) {
                zeroes++;
            } else if (arr[i] == 1) {
                ones++;
            } else if (arr[i] == 2) {
                twos++;
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
        while (twos-- > 0) {
            arr[i] = 2;
            i++;
        }

    }

     public static int[] sort(int arr[], int size) {
        int index = 0;
        int left = 0;
        int right = size - 1;

        while (index <= right) {
            if (arr[index] == 0) {
                int temp = arr[index];
                arr[index] = arr[left];
                arr[left] = temp;
                index++;
                left++;
            } else if (arr[index] == 2) {
                int temp = arr[index];
                arr[index] = arr[right];
                arr[right] = temp;
                right--;
                
            } else {
                index++;
            }
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
