public class RemoveAtK {
    public static void main(String[] args) {
        String s ="hello";
        System.out.println(removeAtFirst(s));
        System.out.println(removeAtLast(s));

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
}
