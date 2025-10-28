public class IntegerToRoman {
    public static void main(String[] args) {
        int num1 = 3749;
        System.out.println(IntToRoman(num1));
        int num2 = 58;
        System.out.println(IntToRoman(num2));
        int num3 = 1994;
        System.out.println(IntToRoman(num3));
        int num4 = 894;
        System.out.println(IntToRoman(num4));
    }

    public static String IntToRoman(int num) {
        String romanSymbols[] = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int values[] = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        StringBuilder ans = new StringBuilder();

        for (int index = 0; index < 13; index++) {
            while (num >= values[index]) {
                ans.append(romanSymbols[index]);
                num -= values[index];
            }
        }
        return ans.toString();
    }
}
