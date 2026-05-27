import java.util.Scanner;

public class SumOfDigitsAnInteger {
    public static void main(String[] args) {
        int number = getInput();
        int result = sumOfDigits(number);

        System.out.println("The sum of integer is: " + result);
    }

    public static int getInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        return input.nextInt();
    }

    public static int sumOfDigits(int num) {
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num = num / 10;
        }
        return sum;
    }
}
