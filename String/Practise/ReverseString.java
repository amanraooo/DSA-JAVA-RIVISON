public class ReverseString {
    public static void main(String[] args) {
        char s[] = { 'h', 'e', 'l', 'l', 'o' };
        reverse(s);
    }

    public static void reverse(char[] s) {
        int l = 0;
        int h = s.length - 1;

        while (l <= h) {
            char temp = s[l];
            s[l] = s[h];
            s[h] = temp;
            l++;
            h--;

        }
        display(s);

    }

    public static void display(char[] s) {
        for (int index = 0; index < s.length; index++) {
            System.out.print("'" + s[index] + "'" + ", ");
        }
    }
}
