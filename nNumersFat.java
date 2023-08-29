package Looping;
import java.util.Scanner;

public class TestFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        // Checking if the number is negative
        if (num < 0) {
            System.out.println("Factorial is undefined for negative numbers.");
            return;
        }

        // Initializing the factorial variable
        int factorial = 1;

        // Calculating the factorial
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        // Displaying the factorial
        System.out.println("The factorial of " + num + " is: " + factorial);
    }
}
