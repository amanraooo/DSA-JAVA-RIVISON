import java.util.Set;

public class DiffOfVowelsAndconsonants {
    public static void main(String[] args) {
        String str = "Hi Aman! 123";
        String str2 = "aman";
        String str3 = "aeiouAEIOU";
        String str4 = "";

        difference(str);
        difference(str2);
        difference(str3);
        difference(str4);


    }

    public static void difference(String str) {
        if (str == null || str.isEmpty()) {
            System.out.println("The string is empty.");
            System.out.println("Vowels: 0, Consonants: 0, Difference: 0");
            return;
        }

        
        int vowelsCount = 0;
        int consonantsCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {

                ch = Character.toLowerCase(ch);

                if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u'){
                    vowelsCount++;
                }
                else {
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
