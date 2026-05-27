import java.util.Scanner;

public class SumAllOddNumber {
    public static void main(String[] args) {
        int num = input();
        int result = sumOfAllOddNumber(num);

        System.out.println("Sum = " + result);
    }

    public static int input() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return input.nextInt();
    }

    public static int sumOfAllOddNumber(int num) {
        int sum = 0;
        int i = 1;
        while (i <= num) {
            if(i % 2 != 0) {
                sum += i;
            }
            i++;
        }
        return sum;
    }
}
