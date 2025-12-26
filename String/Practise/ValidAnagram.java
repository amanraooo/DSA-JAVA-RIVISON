
public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        String s2 = "aman", t2 = "naman";
        String s3 = "rat", t3 = "car";

        System.out.println(isAnagram(s, t));
        System.out.println(isAnagram(s2, t2));
        System.out.println(isAnagram(s3, t3));
        

    }
    public static boolean isAnagram(String s, String t){
        char freq [] = new char[256];
        if(s.length()!=t.length()){
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }
        for (int i = 0; i < t.length(); i++) {
            freq[t.charAt(i)]--;
        }

        for (int index = 0; index < 256; index++) {
            if(freq[index]!=0){
                return false;
            }
        }
        return true;
    }
}
