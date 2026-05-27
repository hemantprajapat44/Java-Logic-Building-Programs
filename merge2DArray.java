public class merge2DArray {
    public static void main(String[] args) {
        int size1 = shortOrNotshort.getSize();
        int[] arr1 = shortOrNotshort.getElement(size1);

        int size2 = shortOrNotshort.getSize();
        int[] arr2 = shortOrNotshort.getElement(size2);

        int[] shortArr = mergeTwoArray(arr1, arr2);

        display(shortArr);
    }

    public static int[] mergeTwoArray(int[] arr1, int[] arr2) {
        int[] shortArr = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        while (i < arr1.length) {
            shortArr[i] = arr1[i];
            i++;
        }

        while (j < arr2.length) {
            shortArr[i] = arr2[j];
            i++;
            j++;
        }
        return shortArr;
    }

    public static void display(int[] arr) {
        System.out.println("Array elements:");
        int k = 0;
        while (k < arr.length) {
            System.out.println(arr[k] + " ");
            k++;
        }
    }
}
