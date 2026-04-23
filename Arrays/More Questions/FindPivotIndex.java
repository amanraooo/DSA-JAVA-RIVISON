public class FindPivotIndex {
    public static void main(String[] args) {
        int arr[] = { 1, 7, 3, 6, 5, 6 };
        System.out.println(bruteforce(arr, arr.length));
        System.out.println(optimized(arr, arr.length));
    }

    public static int bruteforce(int arr[], int n) {

        for (int index = 0; index < n; index++) {
            int leftSum = 0;
            int rightSum = 0;
            for (int L = 0; L < index; L++) {
                leftSum = leftSum + arr[L];
            }
            for (int R = index + 1; R < n; R++) {
                rightSum = rightSum + arr[R];
            }

            if (leftSum == rightSum)
                return index;

        }
        return -1;
    }

     public static int optimized(int arr[], int n){
        int leftsum[]= new int[n];
        int rightsum[]= new int[n];

        for(int i =1; i < n ; i++ ){
            leftsum[i]=leftsum[i-1]+arr[i-1];
        }

        for(int i =n-2; i >= 0; i-- ){
            rightsum[i]=rightsum[i+1]+arr[i+1];
        }

        for (int i = 0; i < n; i++) {
            if(leftsum[i]==rightsum[i]){
                return i;
            }
        }
        return -1;

     }
}
