public class SwappingTypes {
    public static void main(String[] args) {
        int a = 2, b = 5;
        // System.out.println("Before: "+ a+ " "+ b);

        // swap1(a, b);
        // System.out.println("After: "+ a+ " "+ b);
        swap3(a, b);

    }

    // using temp var
    public static void swap1(int a, int b) {
        System.out.println("Before: " + a + " " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After: " + a + " " + b);

    }

    // using arithmetic
    public static void swap2(int a, int b) {
        System.out.println("Before: " + a + " " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After: " + a + " " + b);

    }

    // using XOR method
    public static void swap3(int a, int b) {
        System.out.println("Before: " + a + " " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After: " + a + " " + b);

    }

}
