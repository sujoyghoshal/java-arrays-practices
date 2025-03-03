import java.util.*;

public class EmployeeBonus {
    public static void main(String[] args) {
        //Input value:
        Scanner sc = new Scanner(System.in);
        double[] sal = new double[10], yrs = new double[10], bonus = new double[10], newSal = new double[10];
        double totalBonus = 0, totalOldSal = 0, totalNewSal = 0;
        
        for (int i = 0; i < 10; i++) {
            while (true) {
                System.out.print("Enter salary and years of service for employee " + (i + 1) + ": ");
                sal[i] = sc.nextDouble();
                yrs[i] = sc.nextDouble();
                if (sal[i] > 0 && yrs[i] > 0) break;
                System.out.println("Invalid input. Try again.");
                i--;
            }
        }
        
        for (int i = 0; i < 10; i++) {
            bonus[i] = (yrs[i] > 5) ? sal[i] * 0.05 : sal[i] * 0.02;
            newSal[i] = sal[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSal += sal[i];
            totalNewSal += newSal[i];
        }
        //printing the value
        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSal);
        System.out.println("Total New Salary: " + totalNewSal);
    }
}