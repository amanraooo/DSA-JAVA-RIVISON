public class cleanSpaces {
    public static void main(String[] args) {
        String s = "   hello   world   from   java   ";
        System.out.println(clean(s));
    }

    public static String clean(String s) {
        s = s.trim();
        StringBuilder result = new StringBuilder();
        boolean space = false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == ' ') {
                if (!space) {
                    result.append(ch);
                    space = true;
                }
            } else {
                result.append(ch);
                space = false;
            }
        }
        return result.toString();
    }
}
