import java.util.Arrays;

public class SortMatrix {
    public static void main(String[] args) {
        int mat[][]={
            {9,3,5},
            {4,1,8},
            {6,2,7}
        };
        sort(mat);
    }
    public static void sort(int mat[][]){
        int n = mat.length;
        int m = mat[0].length;

        int arr[] = new int[n*m];
        int k =0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                arr[k++]= mat[i][j];
            }
        }

        Arrays.sort(arr);
        
        k =0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                 mat[i][j]=arr[k++];
            }
        }

    }

    public static void display(int mat[][]){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
