
public class AddAndSubMat {
    public static void main(String[] args) {
         int[][] mat1 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] mat2 = {
                {7, 8, 9},
                {1, 2, 3}
        };

        int res[][] = addMats(mat1, mat2);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] addMats(int mat1[][], int mat2[][]){
        int result[][] = new int[mat1.length][mat1[0].length];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return result;
    }


}
