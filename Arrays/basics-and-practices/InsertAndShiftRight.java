public class InsertAndShiftRight {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40 };
        insertAndRightShift(arr, 2, 25);
        
    }

    public static void insertAndRightShift(int arr[], int x, int num) {
        int ans[] = new int[arr.length + 1];

        for (int i = 0; i < x; i++) {
            ans[i] = arr[i];
        }
        ans[x] = num;
        for (int i = x; i < arr.length; i++) {
            ans[i + 1] = arr[i];
        }
        display(ans);

    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
