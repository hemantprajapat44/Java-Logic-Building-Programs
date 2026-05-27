import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        int num = input();
        printTable(num);
    }

    public static int input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input value");
        System.out.print("Enter a number: ");
        return input.nextInt();
    }

    public static void printTable(int num) {
        int n = 1;
        while (n <= 10) {
            System.out.println(num + "x" + n + "=" + (num * n));
            n++;
        }
    }
}
