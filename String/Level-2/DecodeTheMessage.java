
public class DecodeTheMessage {
    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv";

        System.out.println(decode(key, message));
    }

    public static String decode(String key, String Message) {
        char start = 'a';
        char mapping[] = new char[280];

        // mapping a to z on key
        for (int i = 0; i < key.length(); i++) {
            char ch = key.charAt(i);
            if (ch != ' ' && mapping[ch] == 0) {
                mapping[ch] = start;
                start++;
            }
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < Message.length(); i++) {
            char ch = Message.charAt(i);
            if (ch == ' ') {
                ans.append(' ');
            } else {
                char decode = mapping[ch];
                ans.append(decode);
            }
        }
        return ans.toString();
    }
}
