// Abstract class for calculator operations
abstract class Calculator {
    // Abstract method for performing the operation
    abstract double calculate(double x, double y);
}

// Subclass for addition operation
class Addition extends Calculator {
    @Override
    double calculate(double x, double y) {
        return x + y;
    }
}

// Subclass for subtraction operation
class Subtraction extends Calculator {
    @Override
    double calculate(double x, double y) {
        return x - y;
    }
}

// Subclass for multiplication operation
class Multiplication extends Calculator {
    @Override
    double calculate(double x, double y) {
        return x * y;
    }
}

// Subclass for division operation
class Division extends Calculator {
    @Override
    double calculate(double x, double y) {
        if (y == 0) {
            System.out.println("Error: Division by zero!");
            return Double.NaN; // Return NaN (Not a Number) for division by zero
        } else {
            return x / y;
        }
    }
}

// Main class
public class Main {
    public static void CalcAbstract(String[] args) {
        double operand1 = 10;
        double operand2 = 5;

        // Create instances of subclasses
        Addition add = new Addition();
        Subtraction sub = new Subtraction();
        Multiplication mul = new Multiplication();
        Division div = new Division();

        // Perform addition operation
        System.out.println("Addition: " + add.calculate(operand1, operand2));

        // Perform subtraction operation
        System.out.println("Subtraction: " + sub.calculate(operand1, operand2));

        // Perform multiplication operation
        System.out.println("Multiplication: " + mul.calculate(operand1, operand2));

        // Perform division operation
        System.out.println("Division: " + div.calculate(operand1, operand2));
    }
}
