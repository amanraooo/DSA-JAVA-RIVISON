public class RemoveElements {
    public static void main(String[] args) {
        int nums[]={0,1,2,2,3,0,4,2};
        System.out.println(removeEle(nums, 2));
    }
    public static int removeEle(int nums[], int val){
        int r=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=val){
                nums[r]=nums[i];
                r++;
            }
        }
        return r;
    }
}
