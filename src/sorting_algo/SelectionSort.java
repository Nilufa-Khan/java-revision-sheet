package sorting_algo;

public class SelectionSort {
    public static void main(String[] args) {
       int arr[] = {64, 25, 12, 22, 11};
        System.out.println("Before Sort");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        selectionSort(arr);
    }
    public static void selectionSort(int[] arr){

        for (int i = 0; i <arr.length-1 ; i++) {
            // minimum element find
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j]< arr[min_index]  ){
                    min_index = j;
                    int temp = arr[min_index];
                    arr[min_index] = arr[i];
                    arr[i] = temp;
                }


            }

        }
        //print array
        System.out.println("After Selection Sort");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
