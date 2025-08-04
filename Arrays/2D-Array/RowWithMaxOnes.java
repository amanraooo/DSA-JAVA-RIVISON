public class RowWithMaxOnes {
    public static void main(String[] args) {
        int arr[][] = {
                { 0, 0, 0 },
                { 0, 1, 1 }
        };
        int[] result = find(arr, arr.length, arr[0].length);
        System.out.println("Row with max 1s: " + result[0]);
        System.out.println("Number of 1s: " + result[1]);
    }

    public static int[] find(int arr[][], int r, int c) {
        r = arr.length;
        c = arr[0].length;
        int max = Integer.MIN_VALUE;
        int row = 0;
        for (int i = 0; i < r; i++) {
            int count = 0;
            for (int j = 0; j < c; j++) {
                if (arr[i][j] == 1)
                    count++;
            }
            if (count > max) {
                max = count;
                row = i;
            }

        }
        return new int[]{row, max};


    }
}
