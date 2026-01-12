
public class MaxMinCol {
    public static void main(String[] args) {
        int mat[][] = {
                { 1, 12, 3 },
                { 44, 15, 6 },
                { 7, 888, 9 }
        };
        maxEleCol(mat);
        minEleCol(mat);
    }
    public static void maxEleCol(int mat[][]) {
        for (int i = 0; i < mat[0].length; i++) {
            int max = Integer.MIN_VALUE;

            for (int j = 0; j < mat.length; j++) {
                if (mat[j][i] > max) {
                    max = mat[j][i];
                }

            }
            System.out.println("col: " + i);
            System.out.println("max " + max);
            System.out.println();
        }
    }

    public static void minEleCol(int mat[][]) {
        for (int i = 0; i < mat[0].length; i++) {
            int min = Integer.MAX_VALUE;

            for (int j = 0; j < mat.length; j++) {
                if (mat[j][i] < min) {
                    min = mat[j][i];
                }

            }
            System.out.println("col: " + i);
            System.out.println("min " + min);
            System.out.println();
        }
    }
}
