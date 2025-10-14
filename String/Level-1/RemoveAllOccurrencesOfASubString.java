
public class RemoveAllOccurrencesOfASubString {
    public static void main(String[] args) {
        String s1 = "daabcbaabcbc", part1 = "abc";
        // System.out.println(removeOccurrences(s1, part1));
        System.out.println(removeOccurrences2(s1, part1));

    }

    // using built-in functions
    public static String removeOccurrences(String s, String part) {
        while (s.contains(part)) {
            s = s.replaceFirst(part, "");
            System.out.println(s);
        }
        return s;
    }

    // without built-in functions,using logic
    public static String removeOccurrences2(String s, String part) {
        while (true) {
            int found = s.indexOf(part);
            if (found == -1)
                break;

            String left = s.substring(0, found);
            String right = s.substring(found + part.length());

            s = left + right;
        }
        return s;
    }
}
