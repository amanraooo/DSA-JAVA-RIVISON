public class FindPivotIndex {
    public static void main(String[] args) {
        int arr[] = { 1, 7, 3, 6, 5, 6 };
        System.out.println(bruteforce(arr, arr.length));
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
}
