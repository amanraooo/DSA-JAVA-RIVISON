public class EKOspoj {
    public static void main(String[] args) {
        long treeHeight[] = { 19, 20, 10, 7 }; 
        long result = maxSawBladeHeight(treeHeight, 5);
System.out.println(result);
    }
    public static long maxSawBladeHeight(long arr[],long m){
        long s = 0 ; long e=0 ; long ans = 0;
        for (int i = 0; i < arr.length; i++) {
             e = Math.max(e ,arr[i]);
        }

        while(s<=e){
            long mid = s+(e-s)/2;
            if(isPossible(arr,mid,m)){
                ans = mid;
                s = mid+1;
            }
            else{
                e = mid -1;
            }
        }
        return ans;
    }
    public static boolean isPossible(long[] arr, long mid, long m) {
        long woodCollected =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>mid){
                woodCollected +=  arr[i]-mid;
            }
        }
        return woodCollected >=m;
    }
}
