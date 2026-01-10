public class PrintSubstring {
    public static void main(String[] args) {
        //substring("hello");
        substring2("hello");
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
    
    //optimized
    public static void substring2(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                
                    System.out.println(s.substring(i, j+1));
                

            }

        }
    }
}
