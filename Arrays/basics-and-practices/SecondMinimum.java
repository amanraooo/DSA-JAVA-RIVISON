public class SecondMinimum {
    public static void main(String[] args) {
        int arr[] = { 10, 33, 4, 5, 1 };
        int arr2[] = { 1 };

        System.out.println(secondMin(arr));
        System.out.println(secondMin(arr2));
    }

    public static int secondMin(int arr[]) {
        if (arr.length < 2) {
            System.out.println("Second Min not possible");
            return Integer.MAX_VALUE;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        int secondMinimum = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < secondMinimum && arr[i] != min) {
                secondMinimum = arr[i];
            }
        }
        return secondMinimum;
    }
}
