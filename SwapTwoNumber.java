public class SwapTwoNumber {
    public static void main(String[] args) {
        int numFirst = 8;
        int numSecond = 9;
        System.out.println("first number: " + numFirst);
        System.out.println("Second number: " + numSecond);

        int numThird = numFirst;
        numFirst = numSecond;
        numSecond = numThird;

        System.out.println("Value of numFirst: " + numFirst);
        System.out.println("Value of numSecond: " + numSecond);
    }
}
