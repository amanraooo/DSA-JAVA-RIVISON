
public class Sort_array_by_parity {
    public static void main(String[] args) {
        int nums[] = { 3, 1, 2, 4 };
        System.out.println(sorting(nums));
        display(nums);

    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] sorting(int arr[]) {
        int s = 0;
        int e = arr.length - 1;

        while (s < e) {
            if (arr[s] % 2 == 0) {
                s++;
            } else if (arr[e] % 2 != 0) {
                e--;
            } else {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        return arr;

    }
}
