public class LeftAndRightDiagonals {
    public static void main(String[] args) {
         int mat[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        leftDiagonal(mat);
    }
    public static void leftDiagonal(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (i==j) {
                    System.out.print(mat[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
