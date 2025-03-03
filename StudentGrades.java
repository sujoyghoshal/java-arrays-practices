import java.util.*;

public class StudentGrades {
    public static void main(String[] args) {
        // Number of students and subjects
        int numStudents = 5; 
        int numSubjects = 3;

        // 2D array
        int[][] marks = new int[numStudents][numSubjects];

        String[] subjects = {"Physics", "Chemistry", "Maths"};

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < numSubjects; j++) {
                System.out.print(subjects[j] + ": ");
                marks[i][j] = scanner.nextInt(); 
            }
        }

        // Calculate percentage and grade for each student
        System.out.println("\nStudent Grades:");
        for (int i = 0; i < numStudents; i++) {
            int totalMarks = 0;

            // Calculate total marks for the student
            for (int j = 0; j < numSubjects; j++) {
                totalMarks += marks[i][j];
            }

            // Calculate percentage
            double percentage = (double) totalMarks / (numSubjects * 100) * 100; // Assuming each subject

            // Determine grade based on percentage
            char grade;
            if (percentage >= 90) {
                grade = 'A';
            } else if (percentage >= 80) {
                grade = 'B';
            } else if (percentage >= 70) {
                grade = 'C';
            } else if (percentage >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            // Display results
            System.out.printf("Student %d: Total Marks = %d, Percentage = %.2f%%, Grade = %c%n", 
                              (i + 1), totalMarks, percentage, grade);
        }
    }
}