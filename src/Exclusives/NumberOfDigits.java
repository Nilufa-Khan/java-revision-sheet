package Exclusives;

public class NumberOfDigits {
    public static void main(String[] args) {
        int a = 84658568;
        System.out.println(digit(a));

        }
       public static int digit(int n){
           int count = 0;
           while (n != 0) {
               n = n / 10;
               count++; //why prencrement
           }
           return count;
       }
    }

