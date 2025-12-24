public class Subarray {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40 };
        int arr1[] = { -2,1,-3,4,-1,2,1,-5,4 };

        // subArray(arr);
        // subArraySum(arr);
        System.out.println(MaxSubArraySum(arr1));
    }

    public static void subArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");

                }
                System.out.println();

            }

        }
    }

    public static void subArraySum(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int ans = 0;
            for (int j = i; j < arr.length; j++) {
                ans = ans + arr[j];
                System.out.println(ans);

            }
            System.out.println();

        }

    }

    // using kadance algo: if sum is < 0 sum resets to 0
    public static int MaxSubArraySum(int arr[]) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }

        }
        return max;

    }
}
