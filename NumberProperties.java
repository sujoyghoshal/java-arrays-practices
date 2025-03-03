import java.util.*;

public class NumberProperties {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5]; // 5 numbers arrays

        //user input
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        //Check number
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                System.out.print(numbers[i] + " is positive and ");
                if (numbers[i] % 2 == 0) {
                    System.out.println("even.");
                } else {
                    System.out.println("odd.");
                }
            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is negative.");
            } else {
                System.out.println(numbers[i] + " is zero.");
            }
        }

        //Compare first and last elements
        if (numbers[0] == numbers[numbers.length - 1]) {
            System.out.println("First and last elements are equal.");
        } else if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("First element is greater than the last.");
        } else {
            System.out.println("First element is less than the last.");
        }
    }
}