public class InsertAtK {
    public static void main(String[] args) {
        String s = "hello";
        char c = 'X';
        System.out.println(insertAtFirst(s, c));
        System.out.println(insertAtLast(s, c));
        System.out.println(insertAtK(s, c,2));

    }

    public static String insertAtFirst(String s, char c) {
        StringBuilder result = new StringBuilder();

        result.append(c);
        result.append(s);

        return result.toString();

    }

    public static String insertAtLast(String s, char c) {
        StringBuilder result = new StringBuilder();

        result.append(s);
        result.append(c);

        return result.toString();

    }

    public static String insertAtK(String s, char c, int K) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(i==K){
                result.append(c);
            }
            result.append(s.charAt(i));

            if(K==s.length()){
                insertAtLast(s, c);
            }
        }

        return result.toString();

    }

}
