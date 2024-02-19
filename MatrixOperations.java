import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input matrix A
        System.out.println("Enter the number of rows and columns of matrix A:");
        int rowsA = scanner.nextInt();
        int colsA = scanner.nextInt();
        int[][] matrixA = new int[rowsA][colsA];
        System.out.println("Enter the elements of matrix A:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }
        
        // Input matrix B
        System.out.println("Enter the number of rows and columns of matrix B:");
        int rowsB = scanner.nextInt();
        int colsB = scanner.nextInt();
        int[][] matrixB = new int[rowsB][colsB];
        System.out.println("Enter the elements of matrix B:");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }
        
        // Perform matrix addition
        if (rowsA == rowsB && colsA == colsB) {
            System.out.println("Matrix Addition:");
            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < colsA; j++) {
                    System.out.print(matrixA[i][j] + matrixB[i][j] + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrix addition is not possible: dimensions mismatch.");
        }
        
        // Perform matrix subtraction
        if (rowsA == rowsB && colsA == colsB) {
            System.out.println("Matrix Subtraction:");
            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < colsA; j++) {
                    System.out.print(matrixA[i][j] - matrixB[i][j] + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrix subtraction is not possible: dimensions mismatch.");
        }
        
        // Perform matrix multiplication
        if (colsA == rowsB) {
            System.out.println("Matrix Multiplication:");
            int[][] resultMatrix = new int[rowsA][colsB];
            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < colsB; j++) {
                    for (int k = 0; k < colsA; k++) {
                        resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                    }
                    System.out.print(resultMatrix[i][j] + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrix multiplication is not possible: columns of A must equal rows of B.");
        }
        
        scanner.close();
    }
}
