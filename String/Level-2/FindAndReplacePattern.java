import java.util.ArrayList;
import java.util.List;

public class FindAndReplacePattern {
    public static void main(String[] args) {
        String words1[] = { "abc", "deq", "mee", "aqq", "dkd", "ccc" }, pattern1 = "abb";
        System.out.println(findAndReplacePattern(words1, pattern1));
    }

    public static void createAndUpdateMapping(StringBuilder s){
        char start = 'a';
        char mapping [] = new char[300];

        //mapping the string with abcs
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(mapping[ch]==0){
                mapping[ch]= start;
                start++;
            }
        }

        //update the og string with mapping chars

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            s.setCharAt(i, mapping[ch]);
        }
        
    }
     public static List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<>();
        // firstly normalise the pattern
        StringBuilder Pattern = new StringBuilder(pattern);
        createAndUpdateMapping(Pattern);
        pattern = Pattern.toString();

        // sarre words k saath khelne h
        for (String word : words) {
            StringBuilder tempString = new StringBuilder(word);
            // normalise tempString
            createAndUpdateMapping(tempString);
            if (tempString.toString().equals(pattern)) {
                // it means, that 'word' wali string was a valid answer
                ans.add(word);
            }
        }
        return ans;
    }
}
