

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] ={85,0,99,3,-2,-1};
        sort(arr);
        printArr(arr);
    }
    public static void sort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
