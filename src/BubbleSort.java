public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {23,12,45,66,34,11,1};
        System.out.println("Before sorting array");
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        bubbleSort(arr);

    }
     public static void bubbleSort(int[] arr){
        int temp = 0;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 1; j < arr.length - i ; j++){
                if(arr[j] < arr[j-1]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //print array
         System.out.println("After sorting array");
         for(int i = 0 ; i < arr.length; i++){
             System.out.print(arr[i]+ " ");
         }
     }

}
