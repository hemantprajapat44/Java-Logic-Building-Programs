import java.util.Scanner;

public class SumAndAverageOfAnArray {
    public static void main() {
        int size = sizeOfArray();
        int[] arr = array(size);
        int sum = sumOfArray(arr);
        System.out.println("Sum = " + sum);
    }

    public static int sizeOfArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        return input.nextInt();
    }

    public static int[] array(int sizeOfArray) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[sizeOfArray];
        int i = 0;
        while (i < arr.length) {
            System.out.print("Enter element: " + (i + 1) + ": ");
            arr[i] = input.nextInt();
            i++;
        }
        return arr;
    }

    public static int sumOfArray(int[] arr) {
        int sum = 0;
        int i = 0;
        while(i < arr.length) {
            sum += arr[i];
            i++;
        }
        return sum;
    }
}
