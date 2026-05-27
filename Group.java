import java.util.Scanner;

public class Group {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Check your group it use age");
        System.out.print("Please Enter your age: ");
        int age = input.nextInt();

        if(age < 13) {
            System.out.println("You are child");
        }else if(age < 20) {
            System.out.println("You are teenager");
        }else if(age < 60) {
            System.out.println("You are adult");
        }else {
            System.out.println("you are senior");
        }
    }
}
