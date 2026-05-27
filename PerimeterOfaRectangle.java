import java.util.Scanner;

public class PerimeterOfaRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first side: ");
        int firstSide = input.nextInt();
        System.out.print("Enter second side: ");
        int secondSide = input.nextInt();
        System.out.print("Enter third side");
        int thirdSide = input.nextInt();
        System.out.print("Enter forth side: ");
        int forthSide = input.nextInt();

        int retangle = firstSide + secondSide + thirdSide + forthSide;
        System.out.println("Perimeterofarectangle: " + retangle);
    }
}
