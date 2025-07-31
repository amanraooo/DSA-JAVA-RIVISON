public class ExtremePrint {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println("Extreme Print: " + extremeprint(arr, arr.length));
    }

    public static int[] extremeprint(int arr[], int size) {
        int left = 0;
        int right = size - 1;
        while (left <= right) {
            if (left == right) {
                System.out.println(arr[left]);

            } else {
                System.out.print(arr[left] + " ");
                System.out.print(arr[right] + " ");
            }
            left++;
            right--;
        }
        return arr;
    }
}
