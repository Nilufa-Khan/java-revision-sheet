package sorting_algo;

public class SelectionSort {
    public static void main(String[] args) {
       int arr[] = {64, 25, 12, 22, 11};

       SelectionSort selectionSort1 = new SelectionSort();
        System.out.println("Before Sorting");
         selectionSort1.printArray(arr);
        System.out.println();
        selectionSort1 .selection(arr);
        System.out.println("After Sorting");
       selectionSort1.printArray(arr);

    }
    public  void selection(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int min_index = i;
            for(int j=i+1; j< arr.length;j++){
                if(arr[j]< arr[min_index]){
                    min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }
    public void printArray(int[] arr){
        //print array
        System.out.println("After Selection Sort");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
