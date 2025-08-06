public class WavePrint {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 },
                        { 5, 6, 7, 8 },
                        { 9, 10, 11, 12 }
        };
        test(arr);
    }

    public static void test(int mat[][]) {
        

        for(int c = 0; c< mat[0].length; c++){
            for (int r = 0; r < mat.length; r++) {
                System.out.print(mat[r][c]+ " ");
            }
            System.out.println();

        }

    }

    public static void printColWise(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;

        for (int c = 0; c < m; c++) {
            if (c % 2 == 0) {
                for (int r = 0; r < n; r++) {
                    System.out.print(arr[r][c] + " ");
                }
            } else {
                for (int r = n - 1; r >= 0; r--) {
                    System.out.print(arr[r][c] + " ");
                }
            }
            System.out.println();

        }
    }

    public static void printRowWise(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;

        for (int r = 0; r < n; r++) {
            if (r % 2 == 0) {
                for (int c = 0; c < m; c++) {
                    System.out.print(arr[r][c] + " ");
                }
            } else {
                for (int c = m - 1; c >= 0; c--) {
                    System.out.print(arr[r][c] + " ");
                }
            }
            System.out.println();

        }

    }
}
