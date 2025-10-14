import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        String s2 = "rat", t2 = "car";

        System.out.println(isAnagram1(s,t));
        System.out.println(isAnagram1(s2,t2));

        System.out.println(isAnagram2(s,t));
        System.out.println(isAnagram2(s2,t2));


    }
    //brute force O(nlogn)
    public static boolean isAnagram1(String s, String t){
        char sChar[] = s.toCharArray();
        char tChar[] = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        return Arrays.equals(sChar,tChar);        

    }

    //optimal solution O(n+m)
    public static boolean isAnagram2(String s, String t) {
        int freqTable[] = new int[256];

        for (int i = 0; i < s.length(); i++) {
            freqTable[s.charAt(i)]++;
        }

        for (int i = 0; i < t.length(); i++) {
            freqTable[t.charAt(i)]--;
        }

        for (int i = 0; i < 256; i++) {
            if (freqTable[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
