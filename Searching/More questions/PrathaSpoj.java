public class PrathaSpoj{
    public static void main(String[] args) {
         int rank1[] = { 1, 2, 3, 4 };
        System.out.println(minCookTime(rank1, 10));
    }
    public static int minCookTime(int arr[], int nP){
        int start =0;
        int highestRank = 0;
        for (int i = 0; i < arr.length; i++) {
            highestRank = Math.max(highestRank, arr[i]);
        }
        int end = highestRank * (nP * (nP + 1) / 2);
        int ans = -1;

        while(start<=end){
            int mid = start + (end - start) / 2;
            if(isPossible(arr,mid,nP)){
                ans = mid ;
                end = mid -1;

            }
            else{
                start = mid + 1;
            }
        }
        return ans ;

    }

    public static  boolean isPossible(int arr[], int mid , int nP){
        int currP =0;
        for(int i = 0; i<arr.length; i++){
            int R = arr[i];
            int j = 1;
            int timeTaken =0;
            while(true){
                if(timeTaken + j * R<=mid){
                    currP++;
                    j++;
                    timeTaken += j * R;
                }
                else{
                    break;
                }
            } 
           if (currP >= nP) {
                return true;
            }
        }

        return false;
    }
}