public class MaximumandMinimumOccurringCharacters {
    public static void main(String[] args) {
        String str = "qqqqaaabb";
        find(str);
    }

    public static void find(String s) {
        char[] freq = new char[256];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        char maxChar = ' ';
        char minChar = ' ';

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > max) {
                max = freq[i];
                maxChar = (char) i;
            }
            if (freq[i] < min && freq[i] > 0) {
                min = freq[i];
                minChar = (char) i;

            }
        }

        System.out.println("max char: " + maxChar);

        System.out.println("min char: " + minChar);
    }
}
