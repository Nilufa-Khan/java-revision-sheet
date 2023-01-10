package ArraysHusb;

public class ReplacingDigits {
    void manipulateArray(int number[]) {
        int temp = 0;
        for (int i = 0; i < number.length; i++) {
            temp = number[i] + 1;
            number[i] = number[i] + 1;
        }
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
    }

    public static void main(String[] args) {
        int number[] = {46, 76, 97, 87, 75};
        ReplacingDigits replacingDigits = new ReplacingDigits();
        replacingDigits.manipulateArray(number);
    }
}
