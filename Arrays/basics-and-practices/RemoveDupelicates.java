public class RemoveDupelicates {
    public static void main(String[] args) {
        int nums[] = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(uniqueElements(nums));

    }
    public static int uniqueElements(int arr[]){
        int unique = 0;
        
        int n = arr.length;

        for (int index = 1; index < n; index++) {
            if(arr[unique]==arr[index]){
                index++;
            }
            else{
                unique++;
                arr[unique]=arr[index];
                index++;
            }
        }
        return unique+1 ;
        
    }
}
