public class RowAndColPrint {
    public static void main(String[] args) {
        int mat[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        rowPrint(mat);
        System.out.println("----");
        colPrint(mat);
    }

    public static void rowPrint(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void colPrint(int mat[][]) {
        for (int i = 0; i < mat[0].length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[j][i] + " ");
            }
            System.out.println();
        }
    }
}
