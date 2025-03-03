import java.util.Scanner;

public class StoreAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10]; // Array to store 
        double total = 0.0;
        int index = 0;

        // Take user input 
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double input = sc.nextDouble();
            if (input <= 0 || index == 10) {
                break;
            }
            numbers[index] = input;
            index++;
        }

        // Calculate sum 
        System.out.print("Numbers entered: ");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            total += numbers[i];
        }
        System.out.println("\nSum of numbers: " + total);
    }
}