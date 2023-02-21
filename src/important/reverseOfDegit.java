

import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {
        int reverse= 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();

        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num = num / 10;

        }
        System.out.println("reverse = " + reverse);
    }
}
/**
 * Explanation:
 *
 * The program takes input from the user using the Scanner class and stores it in the variable num.
 * Then, it uses a while loop to continuously extract the last digit of the num using the modulo operator (%) and add it to a new variable reverse multiplied by 10.
 * After each iteration, the num is divided by 10 to remove the last digit.
 * The loop continues until num becomes 0.
 * Finally, the reversed number is printed to the console.
 */