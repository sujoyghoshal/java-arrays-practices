import java.util.*;

public class BMICalculator {
    public static void main(String[] args) {
        //Takes the input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        
        double[] weight = new double[n], height = new double[n], bmi = new double[n];
        String[] status = new String[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight(kg) & height(m) for person " + (i + 1) + ": ");
            weight[i] = sc.nextDouble();
            height[i] = sc.nextDouble();
            bmi[i] = weight[i] / (height[i] * height[i]);
            
            if (bmi[i] <= 18.4) status[i] = "Underweight";
            else if (bmi[i] <= 24.9) status[i] = "Normal";
            else if (bmi[i] <= 39.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }
        //printin the BMI 
        System.out.println("Height(m) \t Weight(kg) \t BMI \t Status");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f \t %.2f \t %.2f \t %s\n", height[i], weight[i], bmi[i], status[i]);
        }
        sc.close();
    }
}
