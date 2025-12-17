public class CheckIfSorted {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 8, 10, 33 };
        System.out.println(ifSorted(arr));

        int arr2[] = { 33, 10, 6, 4, 1 };
        System.out.println(ifSorted(arr2));

        int arr3[] = { 10, 33, 4, 2 };
        System.out.println(ifSorted(arr3));

    }

    public static String ifSorted(int arr[]) {
        boolean asc = true;
        boolean desc = true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1])
                desc = false;
            else if (arr[i] < arr[i - 1])
                asc = false;
        }
        if (asc)
            return "Ascending";
        if (desc)
            return "Descending";
        return "not sorted";

    }
}
