import java.util.Scanner;

public class InputName {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Welcome "  + name +  " to Hacker");
    }
}
