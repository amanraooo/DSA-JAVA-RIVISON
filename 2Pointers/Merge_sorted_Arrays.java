
public class Merge_sorted_Arrays {
    public static void main(String[] args) {
        int nums1[] = {1,2,3,0,0,0};
        int m = 3; int n = 3;
        int nums2[] = {2,5,6};

        
        merge(nums1,m,nums2,n);
    }
    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void merge(int arr1[], int m ,int arr2[], int n){
        int idx = (m+n)-1;
        int i= m-1;
        int j = n-1;

        while(i>=0&&j>=0){
            if(arr1[i]>arr2[j]){
                arr1[idx]=arr1[i];
                i--;
            }
            else{
                arr1[idx]=arr2[j];
                j--;
            }
            idx--;
        }

        while(j>=0){
            arr1[idx]=arr2[j];
            j--;
            idx--;
        }

        display(arr1);

    }
}
