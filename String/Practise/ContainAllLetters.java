public class ContainAllLetters {
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        String s1 = "Hello world";

        System.out.println(ifConains(s));
        System.out.println(ifConains(s1));

    }
    public static boolean ifConains(String s){
        boolean seen[] = new boolean[26];
       s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(isBetweenAToZ(ch)){
                seen[ch -'a'] = true;
            }
        }

        for (int i = 0; i < 26; i++) {
            if(!seen[i]){
                return false;
            }
        }

        
        return true;

    }
    public static boolean isBetweenAToZ(char ch) {
    return ch >= 'a' && ch <= 'z';
}

}
