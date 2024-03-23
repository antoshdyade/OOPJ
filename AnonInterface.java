interface Greeting {
    void greet();
}

public class AnonInterface {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() { // Anonymous class for interface
            @Override
            public void greet() {
                System.out.println("Hello!");
            }
        };

        greeting.greet(); // Output: Hello!
    }
}
