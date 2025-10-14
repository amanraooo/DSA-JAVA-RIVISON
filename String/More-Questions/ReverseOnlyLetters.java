
public class ReverseOnlyLetters {
    public static void main(String[] args) {
        String s1 = "ab-cd";
        String s2 = "a-bC-dEf-ghIj";
        String s3 = "Test1ng-Leet=code-Q!";

        System.out.println(revOnlyLetters(s1));
        System.out.println(revOnlyLetters(s2));
        System.out.println(revOnlyLetters(s3));
    }

    public static String revOnlyLetters(String s) {
        int l = 0;
        int h = s.length() - 1;
        char charArr[] = s.toCharArray();

        while (l < h) {
            if (Character.isAlphabetic(charArr[l]) && Character.isAlphabetic(charArr[h])) {
                char temp = charArr[l];
                charArr[l] = charArr[h];
                charArr[h] = temp;
                l++;
                h--;
            } 
            else if (!Character.isAlphabetic(charArr[l])) {
                l++;
            } 
            else {
                h--;
            }
        }
        return String.valueOf(charArr);
    }
}
