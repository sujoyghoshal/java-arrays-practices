import java.util.ArrayList;
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();

        ArrayList<Integer> factors = new ArrayList<>();
        
        // Find factors of the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors.add(i);
            }
        }
        
        // Display factors
        System.out.println("Factors of " + number + ": " + factors);
    }
}
