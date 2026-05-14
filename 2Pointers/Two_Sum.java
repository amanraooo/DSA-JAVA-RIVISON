import java.util.HashMap;
import java.util.Map;

public class Two_Sum {
    public static void main(String[] args) {
        int nums[] = {2,7,11,15}; int target = 9;
        int ans[]= twoSumOptimized(nums,target);

        display(ans);
        
        int nums1[] = {3,2,4};int target1 = 6;
        int ans1[]= twoSumOptimized(nums1,target1);

        display(ans1);

        int nums2[] = {3,3};int target2 = 6;
        int ans2[]= twoSumOptimized(nums2,target2);

        display(ans2);


    }

    public static int[] twoSumOptimized(int arr[], int target){

        Map<Integer,Integer> hashmap= new HashMap<>();

        for (int index = 0; index < arr.length; index++) {
            hashmap.put(arr[index], index);
        }

        for (int i = 0; i < arr.length; i++) {

            int diff = target-arr[i];
            if(hashmap.containsKey(diff) && hashmap.get(diff)!=i){
                return new int[]{i, hashmap.get(diff)};
            }
        }

        return new int []{-1,-1};


    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
