import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
	System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Calculate sum
        double sum = num1 + num2;

        // Display result
        System.out.println("The sum is: " + sum);

        scanner.close();
    }
}

