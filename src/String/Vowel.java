package String;

import java.util.Scanner;

public class Vowel {
    //Write a Java program to check if a vowel is present in a string.
    //=================================================================

    //ip:  Hi Welcome to my world!"
    //op: iska ulta ok
    //1.take input string from user.
    //2.take a for loop from 0 to string length
    //3.take if condition check str.charAt(i) == 'a'|| like that
    //print the vowel and also print its index.
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String isVoWel = scanner.nextLine();
        System.out.println("isVoWel original= " + isVoWel);
    String rst= "";
    char ch;
        for (int i = 0; i < isVoWel.length(); i++) {
            ch = isVoWel.charAt(i);
            rst = ch + rst;
        System.out.println("index " + i);
        }
        System.out.println("reversed " + rst);
    }



}