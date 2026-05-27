import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        int firstNumber = getInput();
        int secondNUmber = getInput();

        int result = lcm(firstNumber,secondNUmber);
        System.out.println("LCM is: " + result);
    }

    public static int getInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return input.nextInt();
    }

    public static int hcf(int firstNumber, int secondNumber) {
        while (secondNumber != 0) {
            int temp = secondNumber;
            secondNumber = firstNumber % secondNumber;
            firstNumber = temp;
        }
        return firstNumber;
    }

    public static int lcm(int firstNumber, int secondNumber) {
        return (firstNumber * secondNumber) / hcf(firstNumber,secondNumber);
    }
}
