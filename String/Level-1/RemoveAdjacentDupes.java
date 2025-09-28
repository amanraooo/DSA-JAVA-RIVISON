
public class RemoveAdjacentDupes {
    public static void main(String[] args) {
        String s1 = "abbaca";
        System.out.println(removeDuplicates(s1));
        String s2 = "azxxzy";
        System.out.println(removeDuplicates(s2));
        String s3 = "aamany";
        System.out.println(removeDuplicates(s3));
    }
    public static String removeDuplicates(String s){
        StringBuilder ans = new StringBuilder();
        int i = 0;
        while (i<s.length()) {
            if(ans.length()>0 && ans.charAt(ans.length()-1)== s.charAt(i) ){
                ans.deleteCharAt(ans.length()-1);
            }
            else{
                ans.append(s.charAt(i));
            }
            i++;
        }
        return String.valueOf(ans);
    }
}
