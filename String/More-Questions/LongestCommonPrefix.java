
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String strs1[] = { "flower", "flow", "flight" };
        String strs2[] = { "dog", "racecar", "car" };

        System.out.println(longestCommonPrefix(strs1));
        System.out.println(longestCommonPrefix(strs2));
    }

    public static String longestCommonPrefix(String strs[]) {
        if (strs == null || strs.length == 0)
            return "";

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < strs[0].length(); i++) {
            char ch = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
                    return ans.toString();
                }
            }
            ans.append(ch);

        }
        return ans.toString();
    }
}
