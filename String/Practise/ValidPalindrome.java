public class ValidPalindrome {
    public static void main(String[] args) {
        String str = "namak";
        System.out.println(isPalindrome(str));
        String str2 = "naman";
        System.out.println(isPalindrome(str2));
        String str3 = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str3));
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        int s = 0;
        int e = str.length() - 1;

        while (s <= e) {
            if (str.charAt(s) != str.charAt(e)) {
                return false;
            } else {
                s++;
                e--;
            }
        }
        return true;
    }
}
