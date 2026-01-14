public class InverseMatrix {
    public static void main(String[] args) {
        int[][] mat = {
                { 2, 1 },
                { 5, 3 }
        };
        int[][] mat2 = {
                { 5, 1 },
                { 5, 1 }
        };
        findInverse(mat);
        findInverse(mat2);

    }

    public static void findInverse(int mat[][]) {
        int a = mat[0][0];
        int b = mat[0][1];
        int c = mat[1][0];
        int d = mat[1][1];

        int determinant = (a * d) - (b * c);

        if (determinant == 0) {
            System.out.println("Inverse is not possible");
            return;
        }
        System.out.println((double) d / determinant + " " + (double) -b / determinant);
        System.out.println((double) -c / determinant + " " + (double) a / determinant);

    }
}
