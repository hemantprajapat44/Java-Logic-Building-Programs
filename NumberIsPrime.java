import java.util.Scanner;

public class NumberIsPrime {
    public static void main(String[] args) {
        int num = getInput();

        if(isPrime(num)) {
            System.out.println(num + " is a prime number");
        }else {
            System.out.println(num + " is Not a prime number");
        }
    }

    public static int getInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return input.nextInt();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        int i = 2;
        while (i < num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
