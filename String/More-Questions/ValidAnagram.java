public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s,t));

        String s2 = "rat", t2 = "car";
        System.out.println(isAnagram(s2,t2));


    }

    //optimal solution O(n+m)
    public static boolean isAnagram(String s, String t) {
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
