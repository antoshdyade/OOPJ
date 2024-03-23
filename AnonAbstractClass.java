class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

public class AnonAbstractClass {
    public static void main(String[] args) {
        Shape shape = new Shape() { // Anonymous class for non-abstract class
            @Override
            void draw() {
                System.out.println("Drawing a circle");
            }
        };

        shape.draw(); // Output: Drawing a circle
    }
}
