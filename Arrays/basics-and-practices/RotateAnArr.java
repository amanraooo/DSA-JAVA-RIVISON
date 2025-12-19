public class RotateAnArr {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        // shiftToRight(arr);
        //shiftToLeft(arr);
        //rotateByK(arr, 2);
        rotateByK2(arr, 2);

    }

    public static void shiftToRight(int arr[]) {
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;

        display(arr);

    }

    public static void shiftToLeft(int arr[]) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;

        display(arr);

    }

    public static void rotateByK(int arr[], int k){
        for (int i = 0; i < k; i++) {
            int temp = arr[arr.length - 1];
        for (int j = arr.length - 1; j > 0; j--) {
            arr[j] = arr[j - 1];
        }
        arr[0] = temp;
        }
        display(arr);
    }

    public static void rotateByK2(int arr[], int k){
         k = k % arr.length;

         ReverseArr(arr, 0, arr.length-1);
         ReverseArr(arr, 0, k-1);
         ReverseArr(arr, k, arr.length-1);

        display(arr);


    }

    public static void ReverseArr(int arr[], int L, int R) {
        
        while (L < R) {
            int temp = arr[L];
            arr[L] = arr[R];
            arr[R] = temp;
            L++;
            R--;
        }
        
    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
