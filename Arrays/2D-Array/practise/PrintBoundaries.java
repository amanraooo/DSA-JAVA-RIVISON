public class PrintBoundaries {
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
                { 1, 2, 3 ,0},
                { 4, 5, 6 ,0},
                { 7, 8, 9 ,0},
                { 1, 1, 1 ,0}
        };
        boundary(mat1);
        System.out.println("-----");
        boundary(mat2);
        System.out.println("-----");

        boundary(mat3);


    }
    public static void boundary(int mat[][]){
        int n = mat.length;
        int m = mat[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if((i==0 || i==n-1) || (j==0 || j==m-1)){
                    System.out.print(mat[i][j]+ " ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
