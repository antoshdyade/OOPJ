import java.util.Scanner;
public class SequentialSearch {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter the size of the table: ");
 int n = scanner.nextInt();
 int[] array = new int[n];
 System.out.println("Enter the elements of the table:");
 for (int i = 0; i < n; i++) {
 array[i] = scanner.nextInt();
 }
 System.out.print("Enter the item to search for: ");
 int elementSearch = scanner.nextInt();
 int position = sequentialSearch(array, elementSearch);
 if (position != -1) {
 System.out.println("The element " + elementSearch + " has been
found at position " + position + " in the array.");
 } else {
 System.out.println("The element " + elementSearch + " was not found
in the array.");
 }
 }
 public static int sequentialSearch(int[] arr, int target) {
 for (int i = 0; i < arr.length; i++) {
 if (arr[i] == target) {
 return i; // Element found, returns position
 }
 }
 return -1; // Element not found
 }
}
