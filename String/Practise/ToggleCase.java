public class ToggleCase {
    public static void main(String[] args) {
        String str = "Aman123@HELlo";

        System.out.println(togglecase(str));
    }

    public static String togglecase(String str) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                ans.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                ans.append(Character.toUpperCase(ch));
            } else {
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}
