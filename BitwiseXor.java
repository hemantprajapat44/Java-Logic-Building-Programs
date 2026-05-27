import java.util.Scanner;

public class BitwiseXor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Show xor operator");
        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();

        int result = firstNumber ^ secondNumber;
        System.out.println("The result is: " + result);
    }
}
