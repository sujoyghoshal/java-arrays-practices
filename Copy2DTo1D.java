import java.util.Scanner;

public class Copy2DTo1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int rows = sc.nextInt();
        System.out.print("Enter col: ");
        int columns = sc.nextInt();
        int[][] matrix = new int[rows][columns];
        int[] array = new int[rows * columns];
        int index = 0;

        // Take user input for 2D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
                array[index++] = matrix[i][j]; // Copy to 1D array
            }
        }

        // Display 1D array
        System.out.print("1D Array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}