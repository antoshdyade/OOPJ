import java.util.Scanner;
public class BubbleSort {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter the size of the table: ");
 int n = scanner.nextInt();
 int[] array = new int[n];
 System.out.println("Enter the elements of the table:");
 for (int i = 0; i < n; i++) {
 array[i] = scanner.nextInt();
 }
 // Implementation of the bubble sorting algorithm
 for (int i = 0; i < n - 1; i++) {
 for (int j = 0; j < n - 1 - i; j++) {
 if (array[j] > array[j + 1]) {
 int temp = array[j];
 array[j] = array[j + 1];
 array[j + 1] = temp;
 }
 }
 }
 System.out.println("Table sorted:");
 for (int i = 0; i < n; i++) {
 System.out.print(array[i] + " ");
 }
 }
}
