import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Calculate sum and difference
        double sum = num1 + num2;
        double difference = num1 - num2;

        // Display results
        System.out.println("The sum is: " + sum);
        System.out.println("The difference is: " + difference);

        scanner.close();
    }
}

