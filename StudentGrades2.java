import java.util.Scanner;

public class StudentGrades2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();
        int[] physics = new int[numStudents], chemistry = new int[numStudents], maths = new int[numStudents];
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            physics[i] = getValidMark(scanner, "Physics");
            chemistry[i] = getValidMark(scanner, "Chemistry");
            maths[i] = getValidMark(scanner, "Maths");
            percentages[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;
            grades[i] = calculateGrade(percentages[i]);
        }

        System.out.println("\nStudent Results:");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("Student %d: Physics=%d, Chemistry=%d, Maths=%d, Percentage=%.2f%%, Grade=%c%n",
                    i + 1, physics[i], chemistry[i], maths[i], percentages[i], grades[i]);
        }
        scanner.close();
    }

    private static int getValidMark(Scanner scanner, String subject) {
        int mark;
        do {
            System.out.print(subject + ": ");
            mark = scanner.nextInt();
        } while (mark < 0);
        return mark;
    }

    private static char calculateGrade(double percentage) {
        if (percentage >= 80) return 'A';
        if (percentage >= 70) return 'B';
        if (percentage >= 60) return 'C';
        if (percentage >= 50) return 'D';
        if (percentage >= 40) return 'E';
        return 'R';
    }
}