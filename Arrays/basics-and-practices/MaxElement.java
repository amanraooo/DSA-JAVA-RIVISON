public class MaxElement {
    public static void main(String[] args) {
        int arr[] ={10,33,4,5,1};
        System.out.println(maximum(arr));
    }
    public  static int maximum(int arr[] ){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
            max = arr[i];

            }
        }
        return max;

    }
}
