package Tasks;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        StringBuilder reversed = new StringBuilder(input);
        reversed.reverse();

        if (input.equals(reversed.toString())) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }

        scanner.close();
    }
}
