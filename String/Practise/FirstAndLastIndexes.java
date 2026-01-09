public class FirstAndLastIndexes {
    public static void main(String[] args) {

        find("abcaadb");
        find("");
        find("abcd");

    }

    public static void find(String s) {
        if (s.length() == 0) {
            System.out.println("String is empty");
        }
        int firstOcc[] = new int[256];
        int LastOcc[] = new int[256];

        for (int i = 0; i < 256; i++) {
            firstOcc[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (firstOcc[ch] == -1) {
                firstOcc[ch] = i;
            }
            LastOcc[ch] = i;
        }

        for (int i = 0; i < 256; i++) {
            if (firstOcc[i] != -1) {
                System.out.println((char) i + " First: " + firstOcc[i] + " Last " + LastOcc[i]);
            }
        }
    }
}
