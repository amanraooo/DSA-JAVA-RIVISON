public class Sort_colors {
    public static void main(String[] args) {
        int nums[] = { 2, 0, 2, 1, 1, 0 };
        sortColors(nums);
    }

    public static void sortColors(int colors[]) {

        int zeroes = 0;
        int ones = 0;
        int twos = 0;

        for (int index = 0; index < colors.length; index++) {
            if (colors[index] == 0) {
                zeroes++;
            } else if (colors[index] == 1) {
                ones++;
            } else {
                twos++;
            }
        }

        int i = 0;
        while (zeroes-- > 0) {
            colors[i] = 0;
            i++;
        }
        while (ones-- > 0) {
            colors[i] = 1;
            i++;
        }
        while (twos-- > 0) {
            colors[i] = 2;
            i++;
        }

        display(colors);
    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
