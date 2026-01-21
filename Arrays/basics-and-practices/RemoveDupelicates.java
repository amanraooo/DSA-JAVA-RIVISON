public class RemoveDupelicates {
    public static void main(String[] args) {
        int nums1[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int nums2[] = { 1, 1, 2 };

        System.out.println(uniqueElements(nums1));
        System.out.println(uniqueElements(nums2));

        int nums3[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int nums4[] = { 1, 1, 2 };

        uniqueElements2(nums3);
        uniqueElements2(nums4);
    }
    //return count of unique elements
    public static int uniqueElements(int arr[]) {
       int unique =0;
       int n = arr.length;

       for (int i = 1; i <n; i++) {
        if(arr[unique]!=arr[i]){
            unique++;
            arr[unique]=arr[i];
        }
       }
       return unique+1;

    }

    //print those unique elements
    public static void uniqueElements2(int arr[]) {
       int unique =0;
       int n = arr.length;

       for (int i = 1; i < n; i++) {
        if(arr[unique]!=arr[i]){
            unique++;
            arr[unique]=arr[i];
        }
       }
       for (int i = 0; i < unique+1; i++) {
        System.out.print(arr[i]+" ");
       }
       System.out.println();

    }
}
