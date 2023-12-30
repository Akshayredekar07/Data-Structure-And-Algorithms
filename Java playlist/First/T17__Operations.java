package First;

import java.util.Scanner;

public class T17__Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Arithmetic operations
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
        double remainder = num1 % num2;

        // Relational operations
        boolean isEqual = num1 == num2;
        boolean isNotEqual = num1 != num2;
        boolean isGreater = num1 > num2;
        boolean isLess = num1 < num2;
        boolean isGreaterOrEqual = num1 >= num2;
        boolean isLessOrEqual = num1 <= num2;

        // Logical operations
        boolean logicalAnd = isGreater && isLess;
        boolean logicalOr = isGreater || isLess;
        boolean logicalNot = !isEqual;

        // Conditional operator
        String comparisonResult = (num1 > num2) ? "greater than" : "less than or equal to";

        // Output the results
        System.out.println("Arithmetic operations:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        System.out.println("Relational operations:");
        System.out.println("Is equal: " + isEqual);
        System.out.println("Is not equal: " + isNotEqual);
        System.out.println("Is greater: " + isGreater);
        System.out.println("Is less: " + isLess);
        System.out.println("Is greater or equal: " + isGreaterOrEqual);
        System.out.println("Is less or equal: " + isLessOrEqual);

        System.out.println("Logical operations:");
        System.out.println("Logical AND: " + logicalAnd);
        System.out.println("Logical OR: " + logicalOr);
        System.out.println("Logical NOT: " + logicalNot);

        System.out.println("Conditional operator:");
        System.out.println(num1 + " is " + comparisonResult + " " + num2);
    }
}
