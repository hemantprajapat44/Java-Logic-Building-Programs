import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter F: ");
        double f = input.nextDouble();

        double cel = (f - 32) * 5/9;
        System.out.println("Your temperature is: " + cel);
    }
}
