import java.util.Scanner;
public class BinarySearch {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter the size of the sorted array: ");
 int n = scanner.nextInt();
 int[] array = new int[n];
 System.out.println("Enter the elements of the sorted array (in ascending
order):");
 for (int i = 0; i < n; i++) {
 array[i] = scanner.nextInt();
 }
 System.out.print("Enter the item to search for: ");
 int elementSearch = scanner.nextInt();
 int position = binarySearch(array, elementSearch);
 if (position != -1) {
 System.out.println("The element " + elementSearch + " has been
found at position " + position + " in the array.");
 } else {
 System.out.println("The element " + elementSearch + " was not found
in the array.");
 }
 }
 public static int binarySearch(int[] arr, int target) {
 int left = 0;
 int right = arr.length - 1;
 while (left <= right) {
 int mid = left + (right - left) / 2;
 if (arr[mid] == target) {
 return mid;
 }
 if (arr[mid] < target) {
 left = mid + 1;
 } else {
 right = mid - 1;
 }
 }
 return -1;
 }
}
