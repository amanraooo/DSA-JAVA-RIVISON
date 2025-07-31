public class PrintPairs {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30 };
        pairs(arr, arr.length);
    }

    // print array elements in pairs
    public static void pairs(int arr[], int size) {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println("(" + arr[i] + ", " + arr[j] + ")");
            }
        }

    }
}
