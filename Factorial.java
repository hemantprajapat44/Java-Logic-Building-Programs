import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int num = getInput();
        int fact = factorial(num);

        System.out.println(num + " Factorial is: " + fact);
    }

    public static int getInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculate of factorial");
        System.out.print("Enter a number: ");
        return input.nextInt();
    }

    public static int factorial(int num) {
        int fact = 1;
        int i = 1;
        while (i <= num) {
            fact *= i;
            i++;
        }
        return fact;
    }
}
