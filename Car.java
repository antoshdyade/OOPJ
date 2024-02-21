class Car {
    String model;

    Car(String model) {
        this.model = model;
    }
}

public class CarProcessor {
    // Method to modify the Car object
    static void modifyCar(Car car, String newModel) {
        car.model = newModel;
    }

    public static void main(String[] args) {
        Car myCar = new Car("Toyota");
        System.out.println("Before: " + myCar.model);

        // Passing the Car object to the method
        modifyCar(myCar, "Honda");

        System.out.println("After: " + myCar.model);
    }
}
