import java.util.Scanner;

public class minMaxinArray {
    public static void main(String[] args) {
        int size = getSize();
        int[] arr = getElement(size);
        int[] res = minMax(arr);
        System.out.println("Minimum number is :" + res[0]);
        System.out.println("Maximum number is :" + res[1]);
    }

    public static int getSize() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        return input.nextInt();
    }

    public static int[] getElement(int size) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.print("Enter Element of an array" + (i + 1) + ": ");
            arr[i] = input.nextInt();
            i++;
        }
        return arr;
    }

    public static int[] minMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        int i = 0;
        while (i < arr.length) {
            if(arr[i] < min) {
                min = arr[i];
            }if(arr[i] > max) {
                max = arr[i];
            }
            i++;
        }
        int[] result = {min,max};
        return result;
    }
}
