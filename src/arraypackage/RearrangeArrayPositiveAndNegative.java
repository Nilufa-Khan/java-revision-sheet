package arraypackage;

public class RearrangeArrayPositiveAndNegative {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -4, -1, 4};
        int   arr2[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        int[] output = rearramgePositiveAndNegative(arr);
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i]+" ");
        }
    }
    public static  int[] rearramgePositiveAndNegative(int[] arr){
        int[] newArray = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0 || newArray[index]>=0){
                newArray[index] = arr[i];
                index++;
            }
        }
        return newArray;
    }
}
