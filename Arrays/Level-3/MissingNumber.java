public class MissingNumber {
    public static void main(String[] args) {
        //int arr[] = {9,6,4,2,3,5,7,0,1};
        int arr[] = {4,2,0,1};

        System.out.println("Missing num: "+ find(arr));
    }

    public static int find(int arr[]) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        int totalSum = ((n) * (n + 1)) / 2;
        int ans = totalSum - sum;
        return ans;
    }
}
