public class BinarySearch2D {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 3, 5, 7 },
                           { 10, 11, 16, 20 },
                           { 23, 30, 34, 60 } };
        System.out.println(search(matrix, 3));
        System.out.println(search(matrix, 13));
    }

    public static boolean search(int mat[][], int target) {
        int r = mat.length;
        int c = mat[0].length;
        int n = r * c;
        int s = 0;
        int e = n - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            int rowIndex = mid / c;
            int colIndex = mid % c;
            int currNum = mat[rowIndex][colIndex];

            if (currNum == target) {
                return true;
            } else if (currNum > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }

        }
        return false;

    }
}