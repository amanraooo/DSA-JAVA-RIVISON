public class RotateImage {
    public static void main(String[] args) {
        int arr [][] ={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        printArr(arr);
        System.out.println("After Transpose");
        transpose(arr);
        printArr(arr);
        System.out.println("After rotate");
        rotate(arr);
        printArr(arr);
    }
    public static void transpose(int arr[][]) {
        int n = arr.length;
        //transpose
        for (int i = 0; i < n; i++) {
            for (int j = i; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    public static int[] ReverseArr(int arr[]) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }
    public static void rotate(int arr[][]){
        int n = arr.length;
        //now reverse each row
        for (int i = 0; i < n; i++) {
                ReverseArr(arr[i]);
            }
    }
     public static void printArr(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
