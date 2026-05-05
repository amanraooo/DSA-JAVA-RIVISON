public class Sort_array_by_parity_II {
    public static void main(String[] args) {
        int nums[] = {4,2,5,7};
        int nums1[] = {2,3};

        display(sorting(nums));
        display(sorting(nums1));

    }
    
    public static int[] sorting(int arr[]){
         int i =0;
        int j = 1;
        int n = arr.length;

        while (i<n && j<n) {
            if(arr[i]%2==0){
                i+=2;
            }
            else if(arr[j]%2==1){
                j+=2;
            }
            else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i+=2;
                j+=2;
            }
        }
        return arr;
    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
