public class Valid_Palindrome_II{
    public static void main(String[] args) {
        String str = "cbbca";
        System.out.println(isValid(str));
    }
    public static boolean isValid(String str){
        int i = 0;
        int j = str.length()-1;
        while(i<=j){
            if(str.charAt(i)==str.charAt(j)){
                i++; j--;
            }
            else{
                //remove ith ele
                boolean ans1 = checkpalindrome(str, i+1, j);
                boolean ans2 = checkpalindrome(str, i, j-1);

                return ans1 || ans2;
            }
        }
        return true;
    }
    private static boolean checkpalindrome(String str, int i, int j) {
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++; j--;
        }
        return true;
    }
}