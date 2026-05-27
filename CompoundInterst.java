import java.util.Scanner;

public class CompoundInterst {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principle: ");
        double principle = input.nextDouble();
        System.out.print("Enter rate: ");
        double rate = input.nextDouble();
        System.out.print("Enter time: ");
        double time = input.nextDouble();

        double compountInterest = principle * Math.pow((1 + rate/100),time);
        System.out.println("CompountInterest: " + compountInterest);
    }
}
