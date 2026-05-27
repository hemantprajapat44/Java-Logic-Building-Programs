import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int number = getInput();

        if(armStrong(number)) {
            System.out.println("Armstrong number");
        }else {
            System.out.println("Not Armstrong number");
        }
    }

    // Create function for getInput to user
    public static int getInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Print Armstrong number");
        System.out.print("Enter a number: ");
        return input.nextInt();
    }

    // Create function for check number is armStrong
    public static boolean armStrong(int num) {
        int original = num;
        int digits = 0;
        int sum = 0;

        // step 1: digit count
        int temp = num;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        // step 2: Armstrong logic
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;

            int power = 1;
            int i = 1;

            // digit^digits using while
            while (i <= digits) {
                power *= digit;
                i++;
            }
            sum += power;
            temp /= 10;
        }
        return sum == original;
    }
}
