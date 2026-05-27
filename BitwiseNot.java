import java.util.Scanner;

public class BitwiseNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Show not operator");
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int result = ~number;
        System.out.println("The result is: " + result);
    }
}
