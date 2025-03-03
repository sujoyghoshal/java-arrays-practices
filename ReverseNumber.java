import java.util.*;

public class ReverseNumber {
    public static void main(String[] args) {
        //taking input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        String numStr = Integer.toString(num);
        int[] digits = new int[numStr.length()];
        
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        //print reverse number
        System.out.print("Reversed Number: ");
        for (int i = digits.length - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
        //next line printing
        System.out.println();
    }
}