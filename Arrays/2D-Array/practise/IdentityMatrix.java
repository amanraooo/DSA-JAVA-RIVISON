public class IdentityMatrix {
    public static void main(String[] args) {
        int mat[][] = {
                { 1, 0, 0 },
                { 0, 1, 0 },
                { 0, 0, 1 }
        };
        int mat2[][] = {
                { 1, 0, 0 },
                { 0, 1, 0 },
                { 0, 2, 1 }
        };

        System.out.println(isIdentityMatrix(mat));
        System.out.println(isIdentityMatrix(mat2));

    }

    public static boolean isIdentityMatrix(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if ((i == j && mat[i][j] != 1) || (i != j && mat[i][j] != 0)) {
                    return false;
                }
            }
        }
        return true;
    }
}
