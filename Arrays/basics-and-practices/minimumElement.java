public class minimumElement {
    public static void main(String[] args) {
        int arr[] = { 10, 33, 4, 5, 1 };
        System.out.println(minimum(arr));
    }

    public static int minimum(int arr[]) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
