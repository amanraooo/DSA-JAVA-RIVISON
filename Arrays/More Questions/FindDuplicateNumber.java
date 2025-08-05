import java.util.Arrays;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int arr[] ={3,1,5,4,2};
        System.out.println(find(arr, arr.length));
    }
    public static int find(int arr[], int n){
        Arrays.sort(arr);
        for (int i = 0; i < n-1; i++) {
            if(arr[i]==arr[i+1])
            return arr[i];
        }
        return - 1;
    }
}
