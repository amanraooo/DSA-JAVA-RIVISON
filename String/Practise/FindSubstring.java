public class FindSubstring {
    public static void main(String[] args) {
        String haystack = "sadbutsad", needle = "sad";
        String haystack1 = "leetcode", needle1 = "leeto";

        System.out.println(find(haystack, needle));
        System.out.println(find(haystack1, needle1));

    }
    public static int find(String str, String sub){
        int i = 0;
        int j = sub.length()-1;

        while (j<str.length()) {
            String ss = str.substring(i,j+1);
            if(ss.equals(sub)){
                return i;
            }
            else{
                i++; j++;
            }
        }
        return -1;
    }
}
