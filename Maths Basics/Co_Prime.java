
public class Co_Prime {
    public static void main(String[] args) {
        System.out.println(isCoprime(14, 25));
        System.out.println(isCoprime(12, 18));

    }
    public static boolean isCoprime(int a, int b ){
        int hcf =findHCF(a, b);
        return hcf==1;
    }
    public static int findHCF(int a,int b){
        int min = Math.min(a,b);
        int hcf =0;
        for (int index = 1; index <= min; index++) {
            if(a%index==0 && b%index==0){
                hcf =index;
            }
        }
        return hcf;
    }
}
