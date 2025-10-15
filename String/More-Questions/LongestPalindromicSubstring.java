public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "nitin";
        System.out.println(Longestpalinsubstring(s));
    }

    // Brute force approach
    public static String Longestpalinsubstring(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (isPalindrome(s, i, j)) {
                    String t = s.substring(i, j + 1);
                    if (t.length() > ans.length()) {
                        ans = t;
                    }
                }
            }
        }
        return ans;
    }

    public static boolean isPalindrome(String str, int start, int end) {
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
