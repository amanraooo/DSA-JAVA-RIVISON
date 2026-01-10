public class RemoveAtK {
    public static void main(String[] args) {
        String s ="hello";
        System.out.println(removeAtFirst(s));
        System.out.println(removeAtLast(s));
        System.out.println(removeAtK(s,2));

    }
    public static String removeAtFirst(String s){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(i==0){
                continue;
            }
            result.append(s.charAt(i));
        }
        return result.toString();
    }
    public static String removeAtLast(String s){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(i==s.length()-1){
                continue;
            }
            result.append(s.charAt(i));
        }
        return result.toString();
    }
    public static String removeAtK(String s, int K){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(i==K){
                continue;
            }
            result.append(s.charAt(i));
        }
        return result.toString();
    }
}
