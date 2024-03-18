class Rectangle {
    protected double length;
    protected double width;

    // Default constructor
    public Rectangle() {
        length = 0;
        width = 0;
    }

    // Parameterized constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}

class Cuboid extends Rectangle {
    protected double height;

    // Default constructor
    public Cuboid() {
        super();
        height = 0;
    }

    // Parameterized constructor with two parameters
    public Cuboid(double length, double width) {
        super(length, width);
        height = 0;
    }

    // Parameterized constructor with three parameters
    public Cuboid(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}

public class CuboidInheritanceEx {
    public static void main(String[] args) {
        // Creating objects using different constructors
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(5, 10);

        Cuboid cuboid1 = new Cuboid();
        Cuboid cuboid2 = new Cuboid(3, 4);
        Cuboid cuboid3 = new Cuboid(3, 4, 5);

        // Displaying area and volume
        System.out.println("Area of rectangle2: " + rectangle2.getArea());
        System.out.println("Volume of cuboid2: " + cuboid2.getVolume());
        System.out.println("Volume of cuboid3: " + cuboid3.getVolume());
    }
}
