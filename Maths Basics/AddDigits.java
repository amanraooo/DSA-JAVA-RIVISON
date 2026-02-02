public class AddDigits {
    public static void main(String[] args) {
        System.out.println(add(5382));
        System.out.println(add(1024));
        System.out.println(add(9817));


    }
    public static int add(int n ){
        int sum =0;
        while(n>0){
            int lastDigit = n % 10;
            sum = sum + lastDigit;
            n = n / 10;
        }
        return sum ;
    }
}
