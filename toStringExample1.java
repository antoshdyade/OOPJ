public class HelloWorld {
    private String message;

    // Constructor
    public HelloWorld(String message) {
        this.message = message;
    }

    // toString method to represent HelloWorld object as a string
    @Override
    public String toString() {
        return "HelloWorld{" +
                "message='" + message + '\'' +
                '}';
    }

    public static void toStringExample1(String[] args) {
        // Creating a HelloWorld object
        HelloWorld helloWorld = new HelloWorld("Hello, World!");

        // Printing the HelloWorld object
        System.out.println(helloWorld);
    }
}
