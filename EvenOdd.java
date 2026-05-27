import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Check number is even odd");
        System.out.print("Enter a number: ");
        long number = input.nextLong();

        if(number % 2 == 0) {
            System.out.println("The number is even: " + number);
        }else{
            System.out.println("The number is odd: " + number);
        }
    }
}
