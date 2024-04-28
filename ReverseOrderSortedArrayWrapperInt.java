// Importing necessary packages
import java.util.Arrays; // Import for array manipulation
import java.util.Collections; // Import for utility functions related to collections

// Main class
public class ReverseOrderSortedArrayWrapperInt {

    // Main method, entry point of the program
    public static void main(String[] args) {
        // Integer array to be sorted
        Integer[] arr = { 12, 9, 7, 40, 2, 19, 21, 10 };

        // Sorts the array in descending order using Arrays.sort() and Collections.reverseOrder()
        Arrays.sort(arr, Collections.reverseOrder());

        // Printing the sorted array
        System.out.println("Reversed Order Sorted arr[] : " + Arrays.toString(arr));
    }
}
