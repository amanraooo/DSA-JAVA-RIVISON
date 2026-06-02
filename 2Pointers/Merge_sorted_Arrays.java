
public class Merge_sorted_Arrays {
    public static void main(String[] args) {
        int nums1[] = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int n = 3;
        int nums2[] = { 2, 5, 6 };

        //merge(nums1, m, nums2, n);

        int n1[]={1,3,5};
        int n2[]={2,4,6,8,10};
        display(merge2(n1,n2));
    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void merge(int arr1[], int m, int arr2[], int n) {
        int idx = (m + n) - 1;
        int i = m - 1;
        int j = n - 1;

        while (i >= 0 && j >= 0) {
            if (arr1[i] > arr2[j]) {
                arr1[idx] = arr1[i];
                i--;
            } else {
                arr1[idx] = arr2[j];
                j--;
            }
            idx--;
        }

        while (j >= 0) {
            arr1[idx] = arr2[j];
            j--;
            idx--;
        }

        display(arr1);

    }

        public static  int[] merge2(int arr1[], int arr2[]) {
            int  m = arr1.length;
            int n = arr2.length; 
        //int idx = (m + n) - 1;
        int res[] = new int [m+n];
        int i = 0;
        int j = 0;
        int k =0;

        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                res[k] = arr1[i];
                i++;
                k++;
            } else {
                res[k] = arr2[j];
                j++;
                k++;
            }
            
        }

        while (i < m) {
            res[k] = arr1[i];
            i++;
            k++;
        }
        while (j < n) {
            res[k] = arr2[j];
            j++;
            k++;
        }

       return res;

    }
}
