import java.util.*;

public class DigitFrequency {
    public static void main(String[] args) {
        //user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong(); 
        String numberStr = Long.toString(number);
        int[] frequency = new int[10];
        for (int i = 0; i < numberStr.length(); i++) {
            char digitChar = numberStr.charAt(i);
            int digit = Character.getNumericValue(digitChar);
            // Increase the frequency of the digit
            frequency[digit]++;
        }

        // Display the frequency
        System.out.println("Digit Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) { // Only display
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }

        // Close the scanner
        scanner.close();
    }
}