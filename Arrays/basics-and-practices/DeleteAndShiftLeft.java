public class DeleteAndShiftLeft {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        delete(arr, 2);
    }

    public static void delete(int arr[], int x) {
        int ans[] = new int[arr.length - 1];

        for (int i = 0; i < x; i++) {
            ans[i] = arr[i];
        }
        for (int i = x + 1; i < arr.length; i++) {
            ans[i - 1] = arr[i];
        }

        display(ans);

    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
