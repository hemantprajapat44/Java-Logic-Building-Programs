import java.util.Scanner;

public class EvenOddBitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Even odd bitwise");
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if((number & 1) == 1) {
            System.out.println("The number is odd");
        }else {
            System.out.println("The number is even");
        }
    }
}
