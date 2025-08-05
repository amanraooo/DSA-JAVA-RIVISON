public class MissingNumwithDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 5};
        System.out.println(find(arr, arr.length));
    }
    public static int find(int arr[], int n ){
        int [] freq = new int [n+1];

        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }
        for (int i = 1; i <= n; i++) {
            if(freq[i]==0){
                return i;
                
            }
        }
        return -1;
    }
}
