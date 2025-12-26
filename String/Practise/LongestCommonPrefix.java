
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String strs[] = { "flower", "flow", "flight" };
        System.out.println(find(strs));

        String strs2[] = { "dog", "racecar", "car" };
        System.out.println(find(strs2));

        String strs3[] = { "aman", "amazing", "amplitude" };
        System.out.println(find(strs3));
    }

    public static String find(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < strs[0].length(); i++) {
            char ch = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != ch || i >= strs.length) {
                    return ans.toString();
                }
            }
            ans.append(ch);
        }
        return ans.toString();
    }
}
