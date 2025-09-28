
public class PalindromicSubstring {
    public static void main(String[] args) {
        String str = "nitin";
        palinsubstring(str);
    }

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
}
