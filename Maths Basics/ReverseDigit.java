
public class ReverseDigit {
    public static void main(String[] args) {
        System.out.println(reverse(9817));
    }
    public static int reverse(int n ){
        int reversed =0;
        while(n>0){
            int lastDigit = n % 10;
            reversed =    reversed* 10 + lastDigit;
            n = n / 10;
        }
        return reversed;
    }
}
