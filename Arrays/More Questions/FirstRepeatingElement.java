
public class FirstRepeatingElement {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 3, 4, 3, 5, 6 };
        System.out.println(find(arr, arr.length));
    }

    public static int bruteforce(int arr[], int n) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return i + 1;
                }
            }
        }
        return  -1;
    }
     public static int find(int arr[], int n ){
        int [] freq = new int [n+1];

        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }
        for (int i = 1; i <= n; i++) {
            if(freq[arr[i]]>1){
                return arr[i];
                
            }
        }
        return -1;
    }
}
