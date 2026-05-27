import java.util.Scanner;

public class AreaOfaTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = input.nextInt();
        System.out.print("Enter Height: ");
        int height = input.nextInt();

        double area = 0.5 * base * height;
        System.out.println("The area of traingle is: " + area);
    }
}
