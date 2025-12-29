public class ConvertToASCII {
    public static void main(String[] args) {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        // convertString(letters);

        char[] letters2 = {
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
                'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
        };
        convertChar(letters2);

    }

    public static void convertString(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = ch;

            System.out.println(ch + " : " + ascii);
        }
    }

    public static void convertChar(char[] letters) {
        for (int i = 0; i < letters.length; i++) {
            char ch = letters[i];
            int ascii = ch;

            System.out.println(ch + " : " + ascii);
        }
    }
}
