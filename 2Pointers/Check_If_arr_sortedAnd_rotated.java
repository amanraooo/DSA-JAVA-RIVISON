public class Check_If_arr_sortedAnd_rotated {
    public static void main(String[] args) {
       int nums[] = {3,4,5,1,2};
       System.out.println(check(nums));
    }

    public static boolean check(int[] nums) {
        int count=0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]<nums[i-1]){
                count++;
             }
                
        }
        if(nums[0]<nums[nums.length-1]){
            count++;
        }
        if(count<=1){
                    return true;
}
        
        return false;
    }
}
