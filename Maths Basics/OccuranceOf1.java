
public class OccuranceOf1 {
    public static void main(String[] args) {
        System.out.println(find(10));
        System.out.println(find(100));

    }
    public static int find(int n ){
        int count=0;
        for (int i = 1; i <= n; i++) {
            int num = i;
            while(num>0){
                int lastdigit = num%10;
                if(lastdigit==1){
                    count++;
                }
                num = num/10;
            }
        }
        return count;
    }
}
