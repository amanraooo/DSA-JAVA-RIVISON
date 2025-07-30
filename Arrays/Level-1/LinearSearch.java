public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        int target = 30;
        int size = arr.length;
        boolean ans = LinearSearch(arr, size, target);
        if (ans) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }
    }

    // linear search
    // present-> true
    // not present -> false
    public static boolean LinearSearch(int arr[], int size, int target) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }
}
