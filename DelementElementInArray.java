import java.util.Scanner;

public class DelementElementInArray {
    public static void main(String[] args) {
        int size = shortOrNotshort.getSize();
        int[] arr = shortOrNotshort.getElement(size);
        int element = deleteElementInput();
        int newSize = deleteElement(arr, element);

        display(arr, newSize);
    }

    public static int deleteElementInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter delete element: ");
        return input.nextInt();
    }

    public static int deleteElement(int[] arr, int element) {
        int pos = -1;
        int i = 0;
        while (i < arr.length) {
            if(arr[i] == element) {
                pos = i;
                break;
            }
            i++;
        }

        if(pos != -1) {
            int j = pos;
            while (j < arr.length) {
                arr[i] = arr[i + 1];
                j++;
            }
            return arr.length - 1;
        }
        return arr.length;
    }

    public static void display(int[] arr, int newSize) {
        System.out.println("Update Array:");
        int k = 0;
        while (k < newSize) {
            System.out.println(arr[k] + " ");
            k++;
        }
    }
}
