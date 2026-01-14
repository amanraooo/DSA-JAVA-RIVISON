public class SymmetricMat {
    public static void main(String[] args) {
        int[][] mat1 = {
                { 6, 5, 2 },
                { 5, 0, 9 },
                { 2, 9, 3 }
        };
        int[][] mat2 = {
                { 6, 1, 2 },
                { 5, 0, 9 },
                { 2, 9, 3 }
        };
        System.out.println(isSymmetric(mat1));
        System.out.println(isSymmetric(mat2));
        
        System.out.println(isSymmetric2(mat1));
        System.out.println(isSymmetric2(mat2));

    }

    //optimized :without extra space
    public static boolean isSymmetric2(int mat[][]) {
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = i+1; j < mat[0].length; j++) {
                if (mat[i][j] !=mat[j][i]) {
                    return false;
                }
            }
        }
        return true;

    }
    public static boolean isSymmetric(int mat[][]) {
        int transposeMat[][] = transpose(mat);

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] != transposeMat[i][j]) {
                    return false;
                }
            }
        }
        return true;

    }

    public static int[][] transpose(int mat[][]) {
        int result[][] = new int[mat.length][mat[0].length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                result[i][j] = mat[j][i];
            }
        }
        return result;
    }
}
