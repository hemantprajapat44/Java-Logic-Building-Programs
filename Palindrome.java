import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int number = getInput();

        if(palindrome(number)){
            System.out.println("Palindrome number");
        }else {
            System.out.println("Not Palindrome number");
        }
    }

    // Create function for getInput number from user
    public static int getInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Print Palindrome number");
        System.out.print("Enter a number: ");
        return input.nextInt();
    }

    // create function for check Palindrome number
    public static boolean palindrome(int num) {
        int original = num;
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        return original == reverse;
    }
}
