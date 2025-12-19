public class RotateAnArr {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        shiftToRight(arr);

    }
    public static void shiftToRight(int arr[]){
        int temp = arr[arr.length-1];
        for (int i = arr.length-1; i >0 ; i--) {
            arr[i]=arr[i-1];
        }
        arr[0]=temp;

   display(arr);

    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
