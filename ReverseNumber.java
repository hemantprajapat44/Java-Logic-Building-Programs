import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = getInput();
        int result = reverseNumber(number);

        System.out.println("The number is reverse: " + result);
    }

    public static int getInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return input.nextInt();
    }

    public static int reverseNumber(int num) {
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        return reverse;
    }
}
