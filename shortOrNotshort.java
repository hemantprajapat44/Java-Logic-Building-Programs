import java.util.Scanner;

public class shortOrNotshort {
    public static void main(String[] args) {
        int size = getSize();
        int[] arr = getElement(size);
        boolean result = checkIsShort(arr);

        if(result == true) {
            System.out.println("Array is sorted");
        }else {
            System.out.println("Array is unsorted");
        }
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
            System.out.print("Enter element of an array" + (i + 1) + ": ");
            arr[i] = input.nextInt();
            i++;
        }
        return arr;
    }

    public static boolean checkIsShort(int[] arr) {
        int i = 0;
        boolean asc = true;
        boolean desc = true;

        while (i < arr.length-1) {
            if(arr[i] > arr[i+1]) {
                asc = false;
            }
            if(arr[i] < arr[i+1]) {
                desc = false;
            }
            i++;
        }
        return asc || desc;
    }
}
