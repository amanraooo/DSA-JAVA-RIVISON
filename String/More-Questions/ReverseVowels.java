
public class ReverseVowels {
    public static void main(String[] args) {
        String s1 = "IceCreAm";
        String s2 = "leetcode";
        String s3 = "hello";

        System.out.println(revVowels(s1));
        System.out.println(revVowels(s2));
        System.out.println(revVowels(s3));
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u';
    }

    public static String revVowels(String s) {
        char characters[] = s.toCharArray();
        int l = 0;
        int h = s.length() - 1;

        while (l < h) {
            if (isVowel(characters[l]) && isVowel(characters[h])) {
                char temp = characters[l];
                characters[l] = characters[h];
                characters[h] = temp;

                l++;
                h--;
            } 
            else if (!isVowel(characters[l])) {
                l++;
            } 
            else {
                h--;
            }
        }
        return String.valueOf(characters);
    }
}
