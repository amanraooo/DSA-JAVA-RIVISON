public class PrintZigZagMat {
    public static void main(String[] args) {
         int mat1[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },

        };
        int mat2[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
                { 1, 1, 1 }
        };
        int mat3[][] = {
                { 1, 2, 3, 0 },
                { 4, 5, 6, 0 },
                { 7, 8, 9, 0 },
                { 1, 1, 1, 0 }
        };
        zigzag(mat1);
        System.out.println("-----");
        zigzag(mat2);
        System.out.println("-----");
        zigzag(mat3);
    }
    public static void zigzag(int mat[][]){
        for (int i = 0; i < mat.length; i++) {
            if(i%2==0){
                for (int j = 0; j < mat[0].length; j++) {
                    System.out.print(mat[i][j]+" ");
                }
            }
            else{
                for (int j = mat[0].length-1; j >= 0; j--) {
                    System.out.print(mat[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
