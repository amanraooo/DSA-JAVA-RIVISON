public class MissingNumber {
    public static void main(String[] args) {
        int nums[]= {4,3,0,1};
        System.out.println(findMissingNum(nums));

        int nums2[]= {0,1};
        System.out.println(findMissingNum(nums2));
    }
    public static int findMissingNum(int nums[]){
        int n = nums.length;
        int sum =0;
        for (int i = 0; i < n; i++) {
            sum = sum + nums[i];
        }

        int totalSum = ((n)*(n+1))/2;

        int ans = totalSum - sum;

        return ans;
    }
}
