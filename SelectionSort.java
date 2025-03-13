import java.util.Scanner;
public class SelectionSort {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter the size of the table: ");
 int n = scanner.nextInt();
 int[] array = new int[n];
 System.out.println("Enter the elements of the table:");
 for (int i = 0; i < n; i++) {
 array[i] = scanner.nextInt();
 }
 // Call up the sort by selection function
 selectionSort(array);
 System.out.println("Table sorted:");
 for (int i = 0; i < n; i++) {
 System.out.print(array[i] + " ");
 }
 }
 public static void selectionSort(int[] arr) {
 int n = arr.length;
 for (int i = 0; i < n - 1; i++) {
 int minIndex = i;
 for (int j = i + 1; j < n; j++) {
 if (arr[j] < arr[minIndex]) {
 minIndex = j;
 }
 }
 int temp = arr[i];
 arr[i] = arr[minIndex];
 arr[minIndex] = temp;
 }
 }
}
