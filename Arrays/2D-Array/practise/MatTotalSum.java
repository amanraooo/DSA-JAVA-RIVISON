
public class MatTotalSum {
    public static void main(String[] args) {
        int mat[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println(totalSum(mat));
    }

    public static int totalSum(int mat[][]) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                sum = sum + mat[i][j];

            }

        }
        return sum;
    }
}
