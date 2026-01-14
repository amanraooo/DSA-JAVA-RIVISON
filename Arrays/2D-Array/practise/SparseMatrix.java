public class SparseMatrix {
    public static void main(String[] args) {
        int mat[][]={
           { 0  ,0,  3},
           {0  ,0,  0},
            {5  ,0,  0}
        };
        int mat2[][]={
           { 1  ,0,  3},
           {1  ,0,  1},
            {5  ,1,  0}
        };

        int mat3[][]={
           { 0  ,1},
           {0  ,2}
            
        };
        System.out.println(isSparseMatrix(mat));
        System.out.println(isSparseMatrix(mat2));
        System.out.println(isSparseMatrix(mat3));


    }

    public static boolean isSparseMatrix(int mat[][]) {
        int zeroes = 0;
        int nonzeroes = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] != 0) {
                    nonzeroes++;
                } else {
                    zeroes++;
                }
            }
        }
        if (zeroes > nonzeroes) {
            return true;
        }
        return false;
    }
}
