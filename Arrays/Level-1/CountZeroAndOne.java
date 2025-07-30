public class CountZeroAndOne {
    public static void main(String[] args) {
        int arr[] = { 0, 0, 0, 1, 1 , 9, 2, 10};
        
        int size = arr.length;
        Count0and1(arr, size); 
    }

   
    public static void Count0and1(int arr[], int size) {
        int zero = 0;
        int one = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] == 0) {
                zero++;
            } else if(arr[i]==1) {
                one++;
            }
        }
        System.out.println("Zeroes: " + zero + " and Ones: "+ one);

    }
}
