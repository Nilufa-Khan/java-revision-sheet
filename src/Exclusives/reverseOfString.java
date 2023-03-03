package Exclusives;

import java.util.Scanner;

public class reverseOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = scanner.nextLine();
        //using string builder
        StringBuilder builder = new StringBuilder(input);
        builder.reverse();
        String reversed = builder.toString();
        System.out.println("original- " + input);
        System.out.println("Reversed- " + reversed);
        scanner.close();
    }
}
/**
 * builder.reverse(); is a method of the StringBuilder class that reverses the sequence of characters in the StringBuilder object. This means that the original string in the StringBuilder object is now reversed.
 *
 * builder.toString(); is a method of the StringBuilder class that returns a String object representing the data in the StringBuilder object. In this case, it returns a new String object containing the reversed sequence of characters from the original StringBuilder object.
 *
 * These lines are used in the given code to reverse the input string using the StringBuilder class, and store the reversed string in a new variable reversed.
 */