public class Remove_Duplicates_from_sorted_array {
    public static void main(String[] args) {
        int nums[] = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(remove(nums));

    }

    public static int remove(int arr[]){

        int u=0;
        int i=1;

        for (int index = 0; index < arr.length; index++) {
            if(arr[u]!=arr[index]){
                u++;
                arr[u]=arr[index];
            }
        }
        return u+1;
    }
}
