import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Show And operation");
        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();

        int And = firstNumber & secondNumber;
        System.out.println("The value of and: " + And);
    }
}
