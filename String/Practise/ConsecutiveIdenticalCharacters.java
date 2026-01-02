public class ConsecutiveIdenticalCharacters {
    public static void main(String[] args) {
        System.out.println(ifConsecutiveIdenticalCharactersExists("aaab"));
        System.out.println(ifConsecutiveIdenticalCharactersExists("abc"));
        System.out.println(ifConsecutiveIdenticalCharactersExists("a"));
        System.out.println(ifConsecutiveIdenticalCharactersExists(""));

    }

    public static boolean ifConsecutiveIdenticalCharactersExists(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return false;
        }
        
        int count = 1;
        int i = 1;
        while (i < s.length()) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
                if (count >= 2) {
                    return true;
                }
                i++;
            } else {
                count = 1;
                i++;
            }
        }

        return false;
    }
}
