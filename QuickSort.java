import java.util.Scanner;
public class QuickSort {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter the size of the table: ");
 int n = scanner.nextInt();
 int[] array = new int[n];
 System.out.println("Enter the elements of the table:");
 for (int i = 0; i < n; i++) {
 array[i] = scanner.nextInt();
 }
 // Call up the quick sort function
 quickSort(array, 0, n - 1);
 System.out.println("Table sorted:");
 for (int i = 0; i < n; i++) {
 System.out.print(array[i] + " ");
 }
 }
 public static void quickSort(int[] arr, int low, int high) {
 if (low < high) {
 int pivotIndex = partition(arr, low, high);
 quickSort(arr, low, pivotIndex - 1);
 quickSort(arr, pivotIndex + 1, high);
 }
 }
 public static int partition(int[] arr, int low, int high) {
 int pivot = arr[high];
 int i = low - 1;
 for (int j = low; j < high; j++) {
 if (arr[j] < pivot) {
 i++;
 int temp = arr[i];
 arr[i] = arr[j];
 arr[j] = temp;
 }
 }
 int temp = arr[i + 1];
 arr[i + 1] = arr[high];
 arr[high] = temp;
 return i + 1;
 }
}
