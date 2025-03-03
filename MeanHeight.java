import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11]; // input 11 players
        double sum = 0.0;

        // Take user input for heights
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }

        // Calculate and display mean height
        double mean = sum / heights.length;
        System.out.println("Mean height of the team: " + mean);
    }
}