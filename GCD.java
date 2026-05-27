import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        int firstNumber = getInput();
        int secondNumber = getInput();

        int result = gcd(firstNumber,secondNumber);
        System.out.println("The GCD is: " + result);
    }

    public static int getInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number");
        return input.nextInt();
    }

    public static int gcd(int firstNumber, int secondNumber) {
        while (secondNumber != 0) {
            int temp = secondNumber;
            secondNumber = firstNumber % secondNumber;
            firstNumber = temp;
        }
        return firstNumber;
    }
}
