import java.util.*;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10]; // Array to store arr of 10 students

        // Take user input
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // Check voting eligibility
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.println("Invalid age for student " + (i + 1));
            } else if (arr[i] >= 18) {
                System.out.println("The student with the age " + arr[i] + " can vote.");
            } else {
                System.out.println("The student with the age " + arr[i] + " cannot vote.");
            }
        }
    }
}