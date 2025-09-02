public class FindOddOccuringElement {
    public static void main(String[] args) {
        int arr[] ={5,0,0,3,3,1,1,9,9,0,0};
        int result = find(arr);
        System.out.println("ans: "+ result);
    }
    public static int find(int arr[]){
        int n = arr.length;

        int s = 0 ;
        int e = n-1;

        while(s<=e){
            if (s==e){return arr[s];}

            int mid = s + (e - s) / 2; 
            
            // mid check -> even or odd
            if((mid & 1) == 1){ // (mid&1) == 1 -> true-> odd number
                if(arr[mid]==arr[mid-1]){
                    s = mid + 1;
                }
                else{
                    e = mid -1 ;
                }
            }
            // even case of mid 
            else{
                if(arr[mid]==arr[mid+1]){
                    s = mid + 2;
                }
                else{
                    e = mid ;
                }
            }


        }
        return -1;
    }
}
