public class MaxAndMin {
    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };
        
        int max = FindMax(arr, arr.length, arr[0].length);
        System.out.println("Maximum num in array is: " + max);

        int min = FindMin(arr, arr.length, arr[0].length);
        System.out.println("Minimum num in array is: " + min);
    }

    public static int FindMax(int arr[][], int r, int c) {
        int MAX = Integer.MIN_VALUE;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (arr[i][j] > MAX) {
                    MAX = arr[i][j];
                }
            }
        }
        return MAX;
    }

    public static int FindMin(int arr[][], int r, int c) {
        int MIN = Integer.MAX_VALUE;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (arr[i][j] < MIN) {
                    MIN = arr[i][j];
                }
            }
        }
        return MIN;
    }
}
