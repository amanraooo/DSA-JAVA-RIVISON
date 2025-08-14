public class MaxSubarraySum {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, -61, 40, 20 };
        //bruteforce(arr);
        System.out.println("kadance--");
        kadance(arr);
    }

    public static void bruteforce(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int ans = 0;
            for (int j = i; j < arr.length; j++) {

                // System.out.print(arr[p]+ " ");
                ans = ans + arr[j];
                System.err.println(ans);
            }
            System.out.println();

        }
    }

    public static void kadance(int arr[]) {
        int sum = 0;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum < 0) {
                sum = 0;
            }
            System.out.println(sum);

            ans = Math.max(ans,sum);
        }
        System.out.println(ans);
    }
}
