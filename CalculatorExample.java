class Calculator {
    // Method to create and return a new Calculator object
    static Calculator createCalculator() {
        return new Calculator();
    }

    // Method to perform addition and return the result as a Calculator object
    static Calculator add(int a, int b) {
        Calculator result = new Calculator();
        result.value = a + b;
        return result;
    }

    public int value; // Changed access modifier to public
}

class CalculatorExample {
    public static void main(String[] args) {
        // Creating a Calculator object using a method
        Calculator calc1 = Calculator.createCalculator();

        // Performing addition and getting the result as a Calculator object
        Calculator calc2 = Calculator.add(5, 7);

        System.out.println("Calc1 value: " + calc1.value);
        System.out.println("Calc2 value: " + calc2.value);
    }
}
