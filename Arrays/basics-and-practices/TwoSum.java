
public class TwoSum {
    public static void main(String[] args) {
        int arr[] ={2,6,7,8,10};
        int target = 33;
        System.out.println(Tsum(arr,target));

    }
    public static boolean Tsum(int arr[], int target){
        int l =0 ;
        int h = arr.length-1;
        while (l<h) {
            int sum = arr[l]+arr[h];
            if(sum== target){
        return true;
            }
        else if(sum > target)
         h--;

        else if (sum < target) l++;

            }
            return false;
        }  
    }
    