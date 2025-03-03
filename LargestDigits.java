import java.util.*;

public class LargestDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int[] digits = new int[10];
        int idx = 0, maxDigit = 10;
        
        while (num != 0) {
            if (idx == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                System.arraycopy(digits, 0, temp, 0, idx);
                digits = temp;
            }
            digits[idx++] = num % 10;
            num /= 10;
        }
        //largest secoundlargest
        int largest = 0, secondLargest = 0;
        for (int i = 0; i < idx; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        //print
        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
    }
}