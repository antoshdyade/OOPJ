import java.util.Scanner;
public class InsertionSort {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter the size of the table: ");
 int n = scanner.nextInt();
 int[] array = new int[n];
 System.out.println("Enter the elements of the table:");
 for (int i = 0; i < n; i++) {
 array[i] = scanner.nextInt();
 }
 // Call the insertion sort function
 insertSort(array);
 System.out.println("Table sorted:");
 for (int i = 0; i < n; i++) {
 System.out.print(array[i] + " ");
 }
 }
 public static void insertionSort(int[] arr) {
 int n = arr.length;
 for (int i = 1; i < n; i++) {
 int key = arr[i];
 int j = i - 1;
 while (j >= 0 && arr[j] > key) {
 arr[j + 1] = arr[j];
 j--;
 }
 arr[j + 1] = key;
 }
 }
}
