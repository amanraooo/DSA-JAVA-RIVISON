import java.util.Scanner;

public class ImplementationAndOperations {
    public static void main(String[] args) {
        int arr[][] = {
        { 1, 2, 3, 4 },
        { 5, 6, 7, 8 },
        { 9, 10, 11, 12 }
        };

       
        // Scanner sc = new Scanner(System.in);

        // System.out.println("Decide number of rows: ");
        // int r = sc.nextInt();

        // System.out.println("Decide number of columns: ");
        // int c = sc.nextInt();

        // int arr[][] = new int[r][c];

        // for (int i = 0; i < r; i++) {
        //     for (int j = 0; j < c; j++) {
        //         System.out.println("Enter the input for row " + i + " and input for column " + j);
        //         arr[i][j] = sc.nextInt();
        //     }
        // }

        System.out.println("Printing 2D array");
        print2DArray(arr, arr.length, arr[0].length);

        System.out.println("Printing column wise 2D array");
        ColumnWisePrint(arr, arr.length, arr[0].length);
        
    }

    public static void print2DArray(int arr[][], int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void ColumnWisePrint(int arr[][], int r, int c) {
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
   
}