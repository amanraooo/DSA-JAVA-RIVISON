public class InsertAndShiftRight {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40 };
        insertAndRightShift(arr, 2, 25);
        // display(arr);
    }

    public static void insertAndRightShift(int arr[], int x, int num) {
        int ans[] = new int[arr.length + 1];

        for (int i = 0; i < x; i++) {
            ans[i] = arr[i];
        }
        ans[x] = num;
        for (int i = x + 1; i < ans.length; i++) {
            ans[i] = arr[i - 1];
        }
        display(ans);

    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
