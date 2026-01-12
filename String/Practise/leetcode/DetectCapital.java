
public class DetectCapital {
    public static void main(String[] args) {
        
    }
    public static boolean detectCapital(String s){
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(s.charAt(0) || isCapital(ch)){
                return true;
            }
        }
        return false;
    }
    public static boolean isCapital(char ch) {
        return ch >= 'A' && ch <= 'Z';
    }
}
