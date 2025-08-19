public class RotateArray {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        rotate1(arr, 3);
        printArr(arr);

    }

    public static void rotate1(int arr[], int rot){
         rot = rot % arr.length;
        for (int r = 1; r <=rot; r++) {
            int temp = arr[arr.length-1];
            for (int j = arr.length-1; j >=1; j--) {
                arr[j] = arr[j-1];
            }
            arr[0]= temp;
        }
    }
    //optemized
    public static void rotate2(int arr[], int rot){
         rot = rot % arr.length;
        ReverseArr(arr,0,arr.length-1);
        ReverseArr(arr, 0, rot-1);
        ReverseArr(arr, rot, arr.length-1);
    }
    public static void ReverseArr(int arr[], int L, int R) {
        
        while (L <= R) {
            int temp = arr[L];
            arr[L] = arr[R];
            arr[R] = temp;
            L++;
            R--;
        }
        
    }
    
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}