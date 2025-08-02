public class RowwiseSum {
    public static void main(String[] args) {
        int arr[][] = {
                { 1, 1, 1 },
                { 2, 1, 2 },
                { 3, 3, 3 }
        };
        DiagonalPrint(arr, arr.length, arr[0].length);
    }

    public static void sum(int arr[][], int r, int c) {
        for (int i = 0; i < r; i++) {
            int sum = 0;
            for (int j = 0; j < c; j++) {
                sum = sum + arr[i][j];
            }
            System.out.println("Sum of row " + i + " : " + sum);
        }
    }

    public static void DiagonalPrint(int arr[][], int n, int c) {
        int sum = 0;
        for (int r = 0; r < n; r++) {
            
                System.out.print(arr[r][n-1-r] + " ");
                sum = sum+ arr[r][n-1-r];
                
            }
            System.out.println("sum: "+sum);
            
        }
        
    }



