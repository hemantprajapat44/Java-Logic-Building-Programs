import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principle: ");
        double principle = input.nextDouble();
        System.out.print("Enter time: ");
        double time = input.nextDouble();
        System.out.print("Enter rate: ");
        double rate = input.nextDouble();

        double simpleInterest = (principle * time * rate)/100;
        System.out.println("Calculate of simple interest is: " + simpleInterest);
    }
}
