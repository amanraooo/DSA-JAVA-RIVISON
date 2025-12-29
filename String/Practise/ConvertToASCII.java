public class ConvertToASCII {
    public static void main(String[] args) {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        convertString(letters);
    }
    public static void convertString(String str){
        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            int ascii = ch;

            System.out.println(ch + " : " + ascii);
        }
    }
}
