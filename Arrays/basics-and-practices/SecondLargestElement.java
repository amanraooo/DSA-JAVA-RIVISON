public class SecondLargestElement {
    public static void main(String[] args) {
        int arr[] = { 10, 33, 4, 5, 1 };
        int arr2[] = { 1 };

        System.out.println(secondLargest(arr));
        System.out.println(secondLargest(arr2));

    }

    public static int secondLargest(int arr[]) {
        if (arr.length < 2) {
            System.out.println("Second largest not possible");
            return Integer.MIN_VALUE;
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLargest && arr[i] != max) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
