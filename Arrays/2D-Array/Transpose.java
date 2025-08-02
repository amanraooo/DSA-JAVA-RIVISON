public class Transpose {
    public static void main(String[] args) {
        int arr[][] = {
                { 1, 1, 1 },
                { 2 ,2, 2 },
                { 3, 3, 3 }
        };
        System.out.println("Simple print");
        print(arr,  arr.length, arr[0].length);
        transpose(arr,  arr.length, arr[0].length);
        System.out.println("After transpose");
        print(arr,  arr.length, arr[0].length);
    }
     public static void transpose(int arr[][], int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = i; j < col; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
     public static void print(int arr[][], int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
