public class CAdder {
    private int result;

    // Constructor with two int parameters
    public CAdder(int num1, int num2) {
        this.result = num1 + num2;
    }

    // Constructor with float parameters
    public CAdder(float num1, float num2) {
        this.result = (int) (num1 + num2); // Casting to int for simplicity
    }

    // Constructor with String parameters (parsing to int)
    public CAdder(String num1, String num2) {
        this.result = Integer.parseInt(num1) + Integer.parseInt(num2);
    }

    // Method to get the result
    public int getResult() {
        return result;
    }

    public static void main(String[] args) {
        CAdder adder1 = new CAdder(10, 20); // Constructor with int parameters
        System.out.println("Result of adding 10 and 20: " + adder1.getResult());

        CAdder adder2 = new CAdder(10.5f, 20.5f); // Constructor with float parameters
        System.out.println("Result of adding 10.5 and 20.5: " + adder2.getResult());

       CAdder adder3 = new CAdder("10", "20"); // Constructor with String parameters
        System.out.println("Result of adding '10' and '20': " + adder3.getResult());
    }
}
