
public class DivisorsOfNum {
    public static void main(String[] args) {
        divisor(12);
        divisor(36);
        
        divisor2(12);
        divisor2(36);


    }

    public static void divisor(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
            
        }
        System.out.println();
    }

    //optimised
    public static void divisor2(int n) {
        for (int i = 1; i*i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
            if(i!=n/i){
                System.out.print(n/i+ " ");
            }
        }
        System.out.println();
    }
}
