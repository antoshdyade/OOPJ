import java.util.Scanner;

public class LargestOfThreeNumbersIfElseIf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read three numbers from the console
        System.out.println("Enter three numbers:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        // Determine the largest number using if-else-if statements
        double largest;
        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }

        // Print the largest number
        System.out.println("The largest number is: " + largest);

        scanner.close();
    }
}
