import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

<<<<<<< HEAD:add.java
=======
        // Input two numbers
>>>>>>> bc6346369261ce2495486367fa710e709bd99b5e:ArithmeticOperations.java
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

<<<<<<< HEAD:add.java
        // Calculate sum and difference
        double sum = num1 + num2;
        double difference = num1 - num2;

        // Display results
        System.out.println("The sum is: " + sum);
        System.out.println("The difference is: " + difference);
=======
        // Calculate sum and product
        double sum = num1 + num2;
        double product = num1 * num2;

        // Display results
        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + product);
>>>>>>> bc6346369261ce2495486367fa710e709bd99b5e:ArithmeticOperations.java

        scanner.close();
    }
}


