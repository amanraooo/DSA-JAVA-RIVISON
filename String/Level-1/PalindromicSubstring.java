
public class PalindromicSubstring {
    public static void main(String[] args) {
        String str = "nitin";
        //palinsubstring(str);
        System.out.println(countSubstring(str));
    }

    //brute force
    public static void palinsubstring(String str) {
        for (int i = 0; i <= str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String ss = str.substring(i, j);
                if (isPalindrome(ss)) {
                    System.out.print(ss + " , ");
                }
            }
        }
    }
    public static boolean isPalindrome(String str) {
        int s = 0;
        int e = str.length() - 1;
        while (s <= e) {
            if (str.charAt(s) != str.charAt(e)) {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }

    //optimal sol
    public static int countSubstring(String s){
        int totalCount =0;

        for (int center = 0; center <= s.length()-1; center++) {
            
            int oddAns= expand(s,center, center);

            int evenAns = expand(s,center, center+1);

            totalCount = totalCount + oddAns + evenAns; 
        }
        return totalCount;
    }

    public static int expand(String s, int i, int j) {
       int count = 0;
       while(i>=0 && j<=s.length()-1 && s.charAt(i)== s.charAt(j)){
        count++;
        i--; j++;
       }
       return count++;
    }
}
