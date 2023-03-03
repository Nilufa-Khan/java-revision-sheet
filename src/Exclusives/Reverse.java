package Exclusives;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int num, reverse = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a num");
        num = scanner.nextInt();

        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num = num / 10;

        }
        System.out.println("reverse " + reverse);
    }
}
