public class RemoveElement_LT27 {
    public static void main(String[] args) {
        int nums[] = {3,2,2,3}; int val = 3;
        System.out.println(removeEle(nums, val));
    }
    public static int removeEle(int nums[], int val){
        int remove = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!= val){
                nums[remove] = nums[i];
                remove++;
            }
        }
        return remove;
    }  
}
