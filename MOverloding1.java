public class MyClass {
    private int x;
    private int y;

    // Constructor with two parameters
    public MyClass(int x, int y) {
        // Using 'this' keyword to distinguish between instance variables and constructor parameters
        this.x = x;
        this.y = y;
    }

    // Method overloading
    public void printValues() {
        System.out.println("Values: x = " + x + ", y = " + y);
    }

    // Method overloading with additional parameter
    public void printValues(int z) {
        System.out.println("Values: x = " + x + ", y = " + y + ", z = " + z);
    }

    public static void main(String[] args) {
        // Create an object of MyClass
        MyClass obj = new MyClass(10, 20);

        // Call the printValues method without an argument
        obj.printValues();

        // Call the printValues method with an argument
        obj.printValues(30);
    }
}
