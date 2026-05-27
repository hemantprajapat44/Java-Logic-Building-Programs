public class palindromeArray {
    public static void main(String[] args) {
        int size = shortOrNotshort.getSize();
        int[] arr = shortOrNotshort.getElement(size);
        boolean result = palindromeArray(arr);
        display(result);
    }

    public static boolean palindromeArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while ( start < end) {
            if(arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void display(boolean result) {
        if(result) {
            System.out.println("Array is palindrome");
        }else {
            System.out.println("Array is not palindrome");
        }
    }
}
