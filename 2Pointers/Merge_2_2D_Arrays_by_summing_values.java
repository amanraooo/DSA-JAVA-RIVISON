public class Merge_2_2D_Arrays_by_summing_values {

    public static int[][] mergeArrays(int[][] nums1, int[][] nums2) {

        int hash[] = new int[1001];

        for (int i = 0; i < nums1.length; i++) {
            hash[nums1[i][0]]++;
        }
        for (int i = 0; i < nums2.length; i++) {
            hash[nums2[i][0]]++;
        }

        int count = 0;
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] != 0) {
                count++;
            }
        }

        int result[][] = new int[count][2];

        int i = 0;
        int j = 0;
        int r = 0;

        while (i < nums1.length && j < nums2.length) {
            int id1 = nums1[i][0];
            int id2 = nums2[j][0];

            int val1 = nums1[i][1];
            int val2 = nums2[j][1];

            if (id1 == id2) {
                result[r][0] = id1;
                result[r][1] = val1 + val2;
                i++;
                j++;
                r++;
            } else if (id1 < id2) {
                result[r][0] = id1;
                result[r][1] = val1;
                i++;
                r++;
            } else {
                result[r][0] = id2;
                result[r][1] = val2;
                j++;
                r++;
            }
        }
        while (i < nums1.length) {
            result[r][0] = nums1[i][0];
            result[r][1] = nums1[i][1];
            i++;
            r++;
        }

        while (j < nums2.length) {
            result[r][0] = nums2[j][0];
            result[r][1] = nums2[j][1];
            j++;
            r++;
        }

        return result;

    }

    public static void printArr(int matrix[][]) {
        for (int[] row : matrix) {
            System.out.println(row[0] + " " + row[1]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int nums1[][] = { { 1, 2 },
                { 2, 3 },
                { 4, 5 } },
                nums2[][] = { { 1, 4 },
                        { 3, 2 },
                        { 4, 1 } };
        printArr(mergeArrays(nums1, nums2));
        // mergeArrays(nums1, nums2);

        int nums3[][] = { { 2, 4 },
                { 3, 6 },
                { 5, 5 } },
                nums4[][] = { { 1, 3 },
                        { 4, 3 } };
        printArr(mergeArrays(nums3, nums4));
    }
}