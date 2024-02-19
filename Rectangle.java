public class Rectangle {
    private int length;
    private int width;

    // Default constructor
    public Rectangle() {
        this.length = 10;
        this.width = 10;
    }

    // Constructor with one parameter (sets both length and width)
    public Rectangle(int side) {
        this.length = side;
        this.width = side;
    }

    // Constructor with two parameters
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    //Calculate Area of Rectangle 
    public void rectangleArea() {
    	System.out.println("Area of Rectanble is: "+(length*width));
    }

    public static void main(String[] args) {
        Rectangle defaultRectangle = new Rectangle();
        defaultRectangle.rectangleArea();

        Rectangle square = new Rectangle(5);
        square.rectangleArea();

        Rectangle customRectangle = new Rectangle(10, 20);
        customRectangle.rectangleArea();
    }
}
