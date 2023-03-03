package Recursion;

public class Recur2 {
    public static void main(String[] args) {
        Recur2 recur2 = new Recur2();
        System.out.println("fibonacci is "+recur2.fibo(10));
    }
    public int fibo(int a) {
        if (a <= 1) {
            return a;
        }else {
            return fibo(a-1 ) + fibo(a-2);
        }
    }
}
