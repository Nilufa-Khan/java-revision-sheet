package inv_questions;

public class ReverseDigit {
    public static void main(String[] args) {

       int rev = reverseDigit(1564);
        System.out.println("Reverse  = " + rev);
    }
//    1564      4651
    public static  int reverseDigit(int number){
        int reverse = 0;

        while (number > 0){
            int remainder = number % 10;

            reverse = reverse * 10 + remainder;
            number = number /10;
        }
        return reverse;
    }
}
