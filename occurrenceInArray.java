import java.util.Scanner;

public class occurrenceInArray {
    public static void main(String[] args){
        int[] arr = new int[sizeOfArray()];
        array(arr);
        System.out.println("Duplicate element are:");

        int i = 0;
        while (i < arr.length) {
            if (check(arr, arr[i]) > 1) {
                System.out.println(arr[i]);
            }
            i++;
        }
    }

    public static int sizeOfArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        return input.nextInt();
    }

    public static void array(int[] arr) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        while (i < arr.length) {
            System.out.println("Enter element of array" + (i + 1) + ": ");
            arr[i] = input.nextInt();
            i++;
        }
    }

    public static int check(int[] arr, int value) {
        int count = 0;
        int i = 0;
        while(i < arr.length) {
            if (arr[i] == value) {
                count++;
            }
            i++;
        }
        return count;
    }
}
