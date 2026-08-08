package Tasks;

import static java.lang.Math.*;

public class Task9 {

    public static int add(int a, int b) {
        return addExact(a, b);
    }

    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    public static float divide(int a, int b) {
        return (float) floorDiv(a, b);
    }

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        System.out.println("Sum: " + add(a, b));
        System.out.println("Difference: " + subtract(a, b));
        System.out.println("Product: " + multiply(a, b));
        System.out.println("Quotient: " + divide(a, b));
    }
}