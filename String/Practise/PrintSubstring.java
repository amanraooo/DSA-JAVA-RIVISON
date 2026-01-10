public class PrintSubstring {
    public static void main(String[] args) {
        substring("hello");
    }

    public static void substring(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                for (int p = i; p <= j; p++) {
                    System.out.print(s.charAt(p) + " ");
                }
                System.out.println("---");

            }
        }
    }
}
