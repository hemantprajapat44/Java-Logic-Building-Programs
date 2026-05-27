import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Check result");
        System.out.print("Enter the marks: ");
        float marks = input.nextFloat();

        if(marks > 90) {
            System.out.println("The result is A: " + marks);
        }else if(marks > 75) {
            System.out.println("The result is B: " + marks);
        }else if(marks > 60) {
            System.out.println("The result is C: " + marks);
        }else if(marks > 30) {
            System.out.println("The result is D: " + marks);
        }else {
            System.out.println("The result is F mean of Fail");
        }
    }
}
