import java.util.Scanner;

public class ImplementationAndOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = takeInput(size);

        System.out.println("Printing the array: ");
        PrintArray(arr);

        System.out.println("Sum of array: " + sumOfArr(arr));

    }

    // taking input for elements
    public static int[] takeInput(int size) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[size];
        System.out.println("Enter " + size + " elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    // sum of arr
    public static int sumOfArr(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    // printing the array
    public static void PrintArray(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}