public class LargestTwoDigits {
    public static void main(String[] args) {
        int num = 987654; // Example number
        int maxDigit = 1;
        int[] digits = new int[maxDigit];
        int index = 0;
        
        while (num > 0) {
            if (index == maxDigit) {
                maxDigit *= 2; // Increase size
                int[] temp = new int[maxDigit];
                System.arraycopy(digits, 0, temp, 0, digits.length);
                digits = temp;
            }
            digits[index++] = num % 10;
            num /= 10;
        }
        
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        
        System.out.println("Largest: " + largest + ", Second Largest: " + secondLargest);
    }
}
