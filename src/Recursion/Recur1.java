package Recursion;

public class Recur1 {
    public static void main(String[] args) {
        Recur1 rec = new Recur1();
        int mac =rec.fact(3);
        System.out.println(mac);
    }
    public  int fact(int n) {
        if (n == 0) {
            return 1;
        }else {
            return n * fact(n - 1);
        }
    }
}
