
public class MaxAndMinRow {
    public static void main(String[] args) {
        int mat[][] = {
                { 1, 12, 3 },
                { 44, 15, 6 },
                { 7, 888, 9 }
        };
        maxEleRow(mat);
        minEleRow(mat);
    }

    public static void maxEleRow(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            int max = Integer.MIN_VALUE;

            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] > max) {
                    max = mat[i][j];
                }

            }
            System.out.println("row: " + i);
            System.out.println("max " + max);
            System.out.println();
        }
    }

    public static void minEleRow(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            int min = Integer.MAX_VALUE;

            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] < min) {
                    min = mat[i][j];
                }

            }
            System.out.println("row: " + i);
            System.out.println("min " + min);
            System.out.println();
        }
    }

}
