import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int number = getInput();
        int result = fibonacci(number);

        System.out.println("The fibonacci  number is: " + result);
    }

    public static int getInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Print fibonacci number");
        System.out.print("Enter a number: ");
        return input.nextInt();
    }

    public static int fibonacci(int num) {
        int a = 0 ,  b = 1;
        int i = 2;

        while (i <= num) {
            System.out.println(a + "");

            int next = a + b;
            a = b;
            b = next;
            i++;
        }
        return a;
    }
}
