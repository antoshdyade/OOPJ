public class BasicJavaProgram {

    public static void main(String[] args) {
        // Variables
        int num1 = 10;
        int num2 = 5;

        // Arithmetic Operators
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;

        // Comparison Operators
        boolean isEqual = num1 == num2;
        boolean isNotEqual = num1 != num2;
        boolean isGreater = num1 > num2;
        boolean isLess = num1 < num2;
        boolean isGreaterOrEqual = num1 >= num2;
        boolean isLessOrEqual = num1 <= num2;

        // Logical Operators
        boolean logicalAnd = (num1 > 0) && (num2 < 10);
        boolean logicalOr = (num1 > 0) || (num2 < 10);
        boolean logicalNot = !(num1 == num2);

        // Conditional Statements
        if (num1 > num2) {
            System.out.println("num1 is greater than num2");
        } else if (num1 < num2) {
            System.out.println("num1 is less than num2");
        } else {
            System.out.println("num1 is equal to num2");
        }

        // Looping Statements
        System.out.println("Printing numbers from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // Move to the next line

        // Switch Statement
        int dayOfWeek = 3;
        String dayName;
        switch (dayOfWeek) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid day";
        }
        System.out.println("Day of the week: " + dayName);
    }
}
