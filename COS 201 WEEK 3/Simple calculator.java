
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declare variables
        double firstNumber, secondNumber;

        // Get input from the user
        System.out.print("Enter the first number: ");
        firstNumber = input.nextDouble();

        System.out.print("Enter the second number: ");
        secondNumber = input.nextDouble();

        // Perform calculations
        double sum = firstNumber + secondNumber;
        double difference = firstNumber - secondNumber;
        double product = firstNumber * secondNumber;

        // Display results
        System.out.println("\n--- Calculator Results ---");
        System.out.printf("Sum: %.2f%n", sum);
        System.out.printf("Difference: %.2f%n", difference);
        System.out.printf("Product: %.2f%n", product);

        // Check for division by zero
        if (secondNumber != 0) {
            double quotient = firstNumber / secondNumber;
            System.out.printf("Quotient: %.2f%n", quotient);
        } else {
            System.out.println("Quotient: Cannot divide by zero.");
        }

        // Close Scanner
        input.close();
    }
}
