import java.util.Set;

public class DiffOfVowelsAndconsonants {
    public static void main(String[] args) {
        String str = "Hi Aman! 123";
        String str2 = "aman";
        String str3 = "aeiouAEIOU";
        difference(str);
        difference(str2);
        difference(str3);

    }

    public static void difference(String str) {
        if (str == null || str.isEmpty()) {
            System.out.println("The string is empty.");
            System.out.println("Vowels: 0, Consonants: 0, Difference: 0");
            return;
        }

        Set<Character> vowelsSet = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

        int vowelsCount = 0;
        int consonantsCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                if (vowelsSet.contains(ch)) {
                    vowelsCount++;
                } else {
                    consonantsCount++;
                }
            } else {
                continue;
            }
        }
        int difference = consonantsCount - vowelsCount;

        System.out.println("Vowels: " + vowelsCount);
        System.out.println("Consonants: " + consonantsCount);
        System.out.println("Difference: " + difference);

    }

}
