class Vehicle {
    private String brand;
    private String model;
    private int year;

    // Constructor with no parameters
    public Vehicle() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.year = 0;
    }

    // Constructor with brand and model parameters
    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.year = 0;
    }

    // Constructor with brand, model, and year parameters
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

public class VehicleDemoConstructorOverloading {
    public static void main(String[] args) {
        // Creating different types of vehicles using constructor overloading
        Vehicle car1 = new Vehicle();
        Vehicle car2 = new Vehicle("Toyota", "Corolla");
        Vehicle car3 = new Vehicle("Honda", "Civic", 2020);

        // Displaying details of the vehicles
        System.out.println("Car 1 Details:");
        car1.displayDetails();
        System.out.println();

        System.out.println("Car 2 Details:");
        car2.displayDetails();
        System.out.println();

        System.out.println("Car 3 Details:");
        car3.displayDetails();
    }
}
