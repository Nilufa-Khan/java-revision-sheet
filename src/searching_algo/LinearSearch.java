package searching_algo;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 80, 30, 60, 50,110, 100, 130, 170};
        int elementIndex = linear(arr,175);
        System.out.println("elementIndex = " + elementIndex);
        int elementIndex1 = linear(arr,110);
        System.out.println("elementIndex1 = " + elementIndex1);
    }
    public static int linear(int[] arr, int searchElement){
        int index = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == searchElement){
                index = i;
            }
        }
        return  index;
    }
}
