public class Subarray {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40 };
        ss1(arr);
    }

    public static void ss1(int arr[]) {

        for (int i = 0; i <  arr.length; i++) {

            for (int j = i; j <  arr.length; j++) {
                for (int p = i; p <= j; p++) {
                    System.out.print(arr[p]+ " ");
                }
            System.out.println();

            }
        }

    }
    
    }
