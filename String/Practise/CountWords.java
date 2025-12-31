public class CountWords {
    public static void main(String[] args) {
        String s = " hello world from java ";
        System.out.println(count(s));
        String s2 = "hello world from java ";
        System.out.println(count(s2));
    }
    public static int count(String str){
        int wordCount=0;
        for (int i = 0; i < str.length(); i++) {
            

            if((str.charAt(i)!=' ' && (i==0 ||str.charAt(i-1) == ' ')) ){
wordCount++;
            }
        }
        return wordCount;
    }
}
