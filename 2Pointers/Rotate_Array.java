public class Rotate_Array {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        // rotateBruteForce(arr, 3);
        rotateOptimized(arr, 3);
    }

    public static void rotateOptimized(int arr[], int k) {

        reverseArray(arr, 0, arr.length - 1);
        reverseArray(arr, 0, k - 1);
        reverseArray(arr, k, arr.length - 1);

        display(arr);

    }

    public static void reverseArray(int arr[], int s, int e) {

        while (s <= e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }

    // brute force
    public static void rotateBruteForce(int arr[], int k) {

        for (int i = 1; i <= k; i++) {

            int temp = arr[arr.length - 1];
            for (int j = arr.length - 2; j >= 0; j--) {
                arr[j + 1] = arr[j];
            }
            arr[0] = temp;
        }

        display(arr);
    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}