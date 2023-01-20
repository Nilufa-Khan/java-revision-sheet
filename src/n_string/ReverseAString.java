package n_string;

public class ReverseAString {
    public static void main(String[] args) {
        String str = "Making our own reverse function";
        String res = reverse(str);
        System.out.println(res);
    }
    public static String reverse(String str){

        String resultString = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            resultString = resultString + str.charAt(i);
        }
        return resultString;
    }
}
