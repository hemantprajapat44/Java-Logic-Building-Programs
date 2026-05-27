import java.util.Scanner;

public class GreatestThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Check three number who is greatest");
        System.out.print("Enter the first number: ");
        double firstNumber = input.nextDouble();
        System.out.print("Enter the second number: ");
        double secondNumber = input.nextDouble();
        System.out.print("Enter the third number: ");
        double thirdNumber = input.nextDouble();

        if(firstNumber == secondNumber && firstNumber == thirdNumber) {
            System.out.println("All number is equal");
        }else if(firstNumber == secondNumber && firstNumber > thirdNumber){
            System.out.println("First number and Second number is greatest and equal: " + firstNumber);
        }else if(secondNumber == thirdNumber && secondNumber > firstNumber){
            System.out.println("Second number and Third number is greatest and equal: " + secondNumber);
        }else if(thirdNumber == firstNumber && thirdNumber > secondNumber){
            System.out.println("Third number and First number is greatest and equal: " + thirdNumber);
        } else if(firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("The first number is greatest: " + firstNumber);
        }else if(secondNumber > thirdNumber && secondNumber > firstNumber){
            System.out.println("The second number is greatest: " + secondNumber);
        }else{
            System.out.println("The third number is greatest: " + thirdNumber );
        }
    }
}
