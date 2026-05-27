public class reverseOfArray {
    public static void main(String[] args) {
        int size = shortOrNotshort.getSize();
        int[] arr = shortOrNotshort.getElement(size);
        reverse(arr);
        display(arr);
    }

    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void display(int[] arr) {
        int i = 0;
        System.out.println("Reverse Array");
        while (i < arr.length) {
            System.out.println(arr[i] + " ");
            i++;
        }
    }
}
