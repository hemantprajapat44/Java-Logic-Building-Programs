import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int firstNumber = input.nextInt();
        System.out.println("Please enter second number: ");
        int secondNumber = input.nextInt();

        System.out.println("Addition: " + firstNumber + secondNumber);
        System.out.println("Substrion: " + (firstNumber - secondNumber));
        System.out.println("Multiples: " + firstNumber * secondNumber);
        System.out.println("Divided: " + firstNumber / secondNumber);

    }
}
