public class Searching {
    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };

        boolean search = searchTarget(arr, arr.length, arr[0].length, 12);
        if (search) {
            System.out.println("found");
        } else {
            System.out.println("Not found");
        }
    }

    public static boolean searchTarget(int arr[][], int r, int c, int target) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (arr[i][j] == target) {
                    return true;
                }
            }
        }
        return false;

    }

}
