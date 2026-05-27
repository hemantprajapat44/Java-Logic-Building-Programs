import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        System.out.print("Enter numbers of row: ");
        int row = input.nextInt();
        patterns(row);
    }

    // Create function

    // Create function for print patterns
    public static void patterns(int maxRow) {
        int rows = 0;
        while (rows < maxRow) {
            System.out.print("*");
            int i = 0;
            while ( i < rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }
}
