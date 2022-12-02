package arraypackage;

public class MinMaxElement {
    public static void main(String[] args) {

        MinMaxElement minMaxElement = new MinMaxElement();
        int[] arr = {10,1,-1,56,89};
        minMaxElement.maxMin(arr);
    }
    public void maxMin(int[] arr){
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }else if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
