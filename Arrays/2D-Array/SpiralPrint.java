public class SpiralPrint {
    public static void main(String[] args) {
        int mat[][] = { { 1, 2, 3, 4 },
                        { 5, 6, 7, 8 },
                        { 9, 10, 11, 12 }
        };
        spiral(mat);
    }
    public static void spiral(int mat[][]){
        int min_r = 0;
        int max_r = mat.length-1;
        int min_c = 0 ;
        int max_c = mat[0].length-1;

        int count = 0;
        int max = mat.length * mat[0].length;

        while(min_r<=max_r && min_c <= max_c){
            for (int r = min_r; r <= max_r && count<=max; r++) {
                System.out.print(mat[r][min_c]+" ");
                count++;
            }
            System.out.println();
            for (int c = min_c+1; c <= max_c && count<=max; c++) {
                System.out.print(mat[max_r][c]+ " ");
                count++;
            }
            System.out.println();

            for (int r = max_r-1; r >= min_r && count<=max; r--) {
                System.out.print(mat[r][max_c]+" ");
                count++;
            }
            System.out.println();

            for (int c = max_c-1; c >= min_c+1 && count<=max; c--) {
                System.out.print(mat[min_r][c]+ " ");
                count++;
            }
            System.out.println();

           min_r++; min_c++;
           max_r--; max_c--;
        }
    }
}
