public class CountSpecialChars {
    public static void main(String[] args) {
        //speacial chars are those chars that appears as upper and lowercase both in a string
        String word = "aaAbcBC";
        String word1 = "abc";

        System.out.println(specialCharacters(word));
        System.out.println(specialCharacters(word1));


    }
    public static int specialCharacters(String s){
        char lower[] = new char[26];
        char upper[] = new char[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch >='a' && ch<='z'){
                lower[ch-'a']++;
            }
            else{
            upper[ch-'A']++;

            }
        }

       int count =0;
        for (int i = 0; i < 26; i++) {
            
            if(lower[i]!=0 && upper[i]!=0){
                count++;
            }

        }
        return count;

    }
}
