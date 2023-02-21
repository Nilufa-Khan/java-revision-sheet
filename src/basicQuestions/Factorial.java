package basicQuestions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        System.out.println("Factorial of "+ number + " = " + fact(number));
        System.out.println("Do you want to continue ... Enter 1 to continue 0 to exit");
        int choice = scanner.nextInt();
       while(true) {

           if (choice == 0) {

               break;
           }
           if (choice == 1) {
               System.out.println("Enter a number");
               number = scanner.nextInt();
               System.out.println("Factorial of " + number + " = " + fact(number));
           }
           System.out.println("Do you want to continue ... Enter 1 to continue 0 to exit");
           choice = scanner.nextInt();
       }
    }
    public static int fact(int number){
        int factorial = 1;
        for (int i = 1; i <= number ; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
