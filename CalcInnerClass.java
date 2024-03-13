// Calculator class
class Calculator {
    // Addition inner class
    class Addition {
        double calculate(double x, double y) {
            return x + y;
        }
    }

    // Subtraction inner class
    class Subtraction {
        double calculate(double x, double y) {
            return x - y;
        }
    }

    // Multiplication inner class
    class Multiplication {
        double calculate(double x, double y) {
            return x * y;
        }
    }

    // Division inner class
    class Division {
        double calculate(double x, double y) {
            if (y == 0) {
                System.out.println("Error: Division by zero!");
                return Double.NaN; // Return NaN (Not a Number) for division by zero
            } else {
                return x / y;
            }
        }
    }
}
    class CalcInnerClass {
    	
    public static void main(String[] args) {
        // Create an instance of Calculator
        Calculator calculator = new Calculator();

        // Perform addition operation
        Calculator.Addition add = calculator.new Addition();
        System.out.println("Addition: " + add.calculate(10, 5));

        // Perform subtraction operation
        Calculator.Subtraction sub = calculator.new Subtraction();
        System.out.println("Subtraction: " + sub.calculate(10, 5));

        // Perform multiplication operation
        Calculator.Multiplication mul = calculator.new Multiplication();
        System.out.println("Multiplication: " + mul.calculate(10, 5));

        // Perform division operation
        Calculator.Division div = calculator.new Division();
        System.out.println("Division: " + div.calculate(10, 5));
    	}
    }
