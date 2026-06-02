import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Squares_of_a_sorted_array {

    public static void main(String[] args) {
        int nums[] = { -4, -1, 0, 3, 10 };

        display(sortedSquares(nums));

    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] sortedSquares(int[] arr) {

        List<Integer> negNums = new ArrayList<>();
        List<Integer> posNums = new ArrayList<>();

        for (int num : arr) {
            if (num < 0) {
                negNums.add(num);
            } else {
                posNums.add(num);
            }
        }

        for (int i = 0; i < negNums.size(); i++) {
            negNums.set(i, negNums.get(i) * negNums.get(i));
        }

        Collections.reverse(negNums);

        for (int i = 0; i < posNums.size(); i++) {
            posNums.set(i, posNums.get(i) * posNums.get(i));
        }

        int n1 = negNums.size();
        int n2 = posNums.size();

        int[] res = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (negNums.get(i) < posNums.get(j)) {
                res[k++] = negNums.get(i++);
            } else {
                res[k++] = posNums.get(j++);
            }
        }

        while (i < n1) {
            res[k++] = negNums.get(i++);
        }

        while (j < n2) {
            res[k++] = posNums.get(j++);
        }

        return res;
    }
}