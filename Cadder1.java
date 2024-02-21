package amd;

public class Cadder1 {
    private int num1;
    private int num2;

    // Constructor to initialize two integers
    public Cadder1(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Constructor to initialize two floats and convert them to integers
    public Cadder1(float num1, float num2) {
        this.num1 = (int) num1;
        this.num2 = (int) num2;
    }

    // Method to perform addition and return the result
    public int performAddition() {
        return num1 + num2;
    }

    public static void main(String[] args) {
        // Create an object of Adder using the first constructor
        Cadder1 adder1 = new Cadder1(10, 20);
        // Perform addition using the performAddition method
        int result1 = adder1.performAddition();
        System.out.println("Result of adding 10 and 20: " + result1);

        // Create an object of Adder using the second constructor
        Cadder1 adder2 = new Cadder1(15.5f, 25.5f);
        // Perform addition using the performAddition method
        int result2 = adder2.performAddition();
        System.out.println("Result of adding 15.5 and 25.5 (after conversion): " + result2);
    }
}
