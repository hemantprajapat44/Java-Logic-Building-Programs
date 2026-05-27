import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Check number is positive negative and zero");
        System.out.print("Enter a number: ");
        long number = input.nextLong();

        if(number > 0) {
            System.out.println("The number is positive: " + number);
        }else if(number == 0) {
            System.out.println("The number is zero: " + number);
        }else{
            System.out.println("The number is negative:" + number);
        }
    }
}
