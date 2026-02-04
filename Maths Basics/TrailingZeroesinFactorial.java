public class TrailingZeroesinFactorial {
    public static void main(String[] args) {
        System.out.println(trailingZeroes(5));    
        System.out.println(trailingZeroes(10));   
        System.out.println(trailingZeroes(25));   
        System.out.println(trailingZeroes(100));
    }
    public static int trailingZeroes(int n){
        int count =0;
        
        while(n>0){
            n = n/5;
            count = count +n;
        }
        return count;
    }
}
