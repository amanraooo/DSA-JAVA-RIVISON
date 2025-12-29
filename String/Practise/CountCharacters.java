public class CountCharacters {
    public static void main(String[] args) {
         String str = "Aman123@#";
         count(str);
    }
    public static void count(String str){
        int letters=0;
        int numbers=0;
        int symbols=0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if((ch >='A' && ch<='Z') || (ch >='a' && ch<='z')) letters++;

           else if(ch >='0' && ch<='9' ) numbers++;

           else symbols++;

        }
        System.out.println("Count of letters "+ " : "+letters);
        System.out.println("Count of numbers "+ " : "+numbers);
        System.out.println("Count of symbols "+ " : "+symbols);


    }
}
