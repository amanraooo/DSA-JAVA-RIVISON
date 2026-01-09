public class InsertAtK {
    public static void main(String[] args) {
        String s ="hello"; char c = 'X';
       System.out.println(insertAtFirst(s, c));
       System.out.println(insertAtLast(s, c));
    }
    public static  String insertAtFirst(String s, char c  ){
        StringBuilder result = new StringBuilder();
 
        result.append(c);
        result.append(s);


        return result.toString();

        
    }
    public static  String insertAtLast(String s, char c  ){
        StringBuilder result = new StringBuilder();
 
        result.append(s);
        result.append(c);

        return result.toString();

        
    }
    
}
