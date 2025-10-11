public class MajorityElement {
    public static void main(String[] args) {
        int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(MJ1(nums));

    }

    public static int MJ1(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count > n / 2) {
                return arr[i];
            }
        }
        return -1;
    }
}
