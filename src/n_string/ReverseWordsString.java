package n_string;

public class ReverseWordsString {
    public static void main(String[] args) {
        String str[] = "tukda ka jigar mera ho chand mera  Z, you love I".split(" ");
        String ans = "";

        for (int i = str.length - 1; i >= 0 ; i--) {
            ans += str[i] + " ";

        }



        System.out.println(ans.substring(0, ans.length()-1));
    }




}
