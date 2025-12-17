
public class PrintALternateElements {
    public static void main(String[] args) {
        int arr[]= {2,4,6,8,10,12};
        print(arr);
    }

    public static void print(int arr[]){
        for (int i = 0; i < arr.length; i+=2) {
           
                System.out.println(arr[i]);
            
        }
    }

}
