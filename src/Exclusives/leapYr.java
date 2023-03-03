package Exclusives;

import java.time.Year;
import java.util.Scanner;

public class leapYr {
    public static void main(String[] args) {
        int year ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a year ");
        year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("leap hai ");

        } else {

            System.out.println("nahi hai ye");
        }
    }



}
