package sorting_algo;

public class SelectionSort {
    public static void main(String[] args) {

    }
    public static void selectionSort(int[] arr){

        for (int i = 0; i <arr.length ; i++) {
            // minimum element find
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[min_index] > arr[j]){
                    min_index = j;

                }
//                Swap the found minimum element with the first element
                int temp = arr[min_index];
                arr[min_index] = arr[i];
                arr[i] = temp;
            }

        }
    }
}
