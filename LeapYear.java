import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Check year is leap year or not leap year");
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("The year is leap year: " + year);
        }else {
            System.out.println("The year is not leap year: " + year);
        }
    }
}
