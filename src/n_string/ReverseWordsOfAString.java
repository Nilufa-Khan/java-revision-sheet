package n_string;

public class ReverseWordsOfAString {
    public static void main(String[] args) {


        String str = "i love programming very much hi";
        char[] res = reverseWords(str.toCharArray());
        for (int i = 0; i <res.length ; i++) {
            System.out.print(res[i]);
        }


    }
//function to reverse letters of the word
    public static void reverseLetterOfAWords(char[] str, int start, int end){

        char temp;
        while(start <= end){
            // swapping the first and last character
            temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }
    //function to reverse the words

    public static char[] reverseWords(char[] str){
        //reversing individual words
        int start = 0;
        for (int i = 0; i < str.length ; i++) {
            if(str[i] == ' '){

                reverseLetterOfAWords(str,start,i); //i = end index
                start = i +1;


            }
        }
        //reverse the last word
        reverseLetterOfAWords(str,start, str.length-1);

        //reverse the entire string
        reverseLetterOfAWords(str,0, str.length-1);
        return str;
    }

}
