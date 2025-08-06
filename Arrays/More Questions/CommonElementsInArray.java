public class CommonElementsInArray {
    public static void main(String[] args) {
        int arr1[] = { 1, 5, 10, 20, 40, 80 };
        int arr2[] = { 6, 7, 20, 80, 100 };
        int arr3[] = { 3, 4, 15, 20, 30, 70, 80, 120 };

        int[] result = FindInThreeArrays(arr1, arr2, arr3, arr1.length, arr2.length,
        arr3.length);

        

    }

    public static int[] FindInThreeArrays(int arr1[], int arr2[], int arr3[], int n1, int n2, int n3) {
        int ans[] = new int[100];
        int i = 0;
        int a1 = 0;
        int a2 = 0;
        int a3 = 0;

        while (a1 <= n1 - 1 && a2 <= n2 - 1 && a3 <= n3 - 1) {
            if (arr1[a1] == arr2[a2] && arr2[a2] == arr3[a3]) {
                ans[i++] = arr1[a1];
                a1++;
                a2++;
                a3++;
            } else if (arr1[a1] < arr2[a2]) {
                a1++;
            } else if (arr2[a2] < arr3[a3]) {
                a2++;
            } else {
                a3++;
            }

        }
        return ans;

    }

    
}