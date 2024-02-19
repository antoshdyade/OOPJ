import java.util.Scanner;

public class SecondLargestInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;  //The Integer. MIN_VALUE is a constant in the Integer class, hold minimum value represented in 32 bits (which is -2147483648).
        
        for (int i = 1; i < size; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("The second largest element in the array is: " + secondLargest);
        }
        
        scanner.close();
    }
}
