import java.util.Scanner;
public class MergeSort {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter the size of the table: ");
 int n = scanner.nextInt();
 int[] array = new int[n];
 System.out.println("Enter the elements of the table:");
 for (int i = 0; i < n; i++) {
 array[i] = scanner.nextInt();
 }
 // Call the merge sort function
 mergeSort(array, 0, n - 1);
 System.out.println("Table sorted:");
 for (int i = 0; i < n; i++) {
 System.out.print(array[i] + " ");
 }
 }
 public static void mergeSort(int[] arr, int left, int right) {
 if (left < right) {
 int middle = (left + right) / 2;
 mergeSort(arr, left, middle);
 mergeSort(arr, middle + 1, right);
 merge(arr, left, middle, right);
 }
 }
 public static void merge(int[] arr, int left, int middle, int right) {
 int n1 = middle - left + 1;
 int n2 = right - middle;
 int[] leftArray = new int[n1];
 int[] rightArray = new int[n2];
 for (int i = 0; i < n1; i++) {
 leftArray[i] = arr[left + i];
 }
 for (int j = 0; j < n2; j++) {
 rightArray[j] = arr[middle + 1 + j];
 }
 int i = 0, j = 0, k = left;
 while (i < n1 && j < n2) {
 if (leftArray[i] <= rightArray[j]) {
 arr[k] = leftArray[i];
 i++;
 } else {
 arr[k] = rightArray[j];
 j++;
 }
 k++;
 }
 while (i < n1) {
 arr[k] = leftArray[i];
 i++;
 k++;
 }
 while (j < n2) {
 arr[k] = rightArray[j];
 j++;
 k++;
 }
 }
}
