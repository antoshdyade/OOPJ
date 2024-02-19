class Calculator {
    // Constructor with no parameters
    public Calculator() {
        System.out.println("Calculator initialized with default settings.");
    }

    // Constructor with one parameter (for setting a custom mode)
    public Calculator(String mode) {
        System.out.println("Calculator initialized in " + mode + " mode.");
    }

    // Constructor with two parameters (for setting custom precision and mode)
    public Calculator(int precision, String mode) {
        System.out.println("Calculator initialized with precision " + precision + " in " + mode + " mode.");
    }

    // Method to add two numbers
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    // Method to subtract two numbers
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    // Method to multiply two numbers
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    // Method to divide two numbers
    public double divide(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return Double.NaN; // Not-a-Number
        }
        return (double) num1 / num2;
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        // Creating different calculators using constructor overloading
        Calculator basicCalculator = new Calculator();
        Calculator scientificCalculator = new Calculator("scientific");
        Calculator precisionCalculator = new Calculator(4, "precision");

        // Performing calculations with the basic calculator
        System.out.println("Addition result: " + basicCalculator.add(10, 5));
        System.out.println("Subtraction result: " + basicCalculator.subtract(10, 5));
        System.out.println("Multiplication result: " + basicCalculator.multiply(10, 5));
        System.out.println("Division result: " + basicCalculator.divide(10, 5));
    }
}
