package Tasks;

public class Task8 {

    public static int sumOfSums(int... numbers) {
        int total = 0;

        for (int n : numbers) {
            int sum = 0;

            for (int i = 1; i <= n; i++) {
                sum += i;
            }

            total += sum;

            System.out.println("Parameter " + n +
                    ": sum = " + sum +
                    ", cumulative sum = " + total);
        }

        return total;
    }

    public static void main(String[] args) {

        int total = sumOfSums(4, 5, 10);

        System.out.println("Total sum: " + total);
    }
}