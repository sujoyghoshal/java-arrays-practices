import java.util.Scanner;

public class MultiplicationTableRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] results = new int[4]; // Array to store results for 6 to 9

        // Generate multiplication table 
        for (int i = 6, j = 0; i <= 9; i++, j++) {
            results[j] = number * i;
            System.out.println(number + " * " + i + " = " + results[j]);
        }
    }
}