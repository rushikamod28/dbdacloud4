import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input two numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        double difference = num1 - num2;
	double product = num1 * num2;
        System.out.println("The difference is: " + difference);

        // Display results
        System.out.println("The sum is: " + sum);
	System.out.println("The difference is: " + difference);
        System.out.println("The product is: " + product);

        scanner.close();
    }
}


