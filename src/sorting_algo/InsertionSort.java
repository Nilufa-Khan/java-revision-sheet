package sorting_algo;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 12, 31, 25, 8, 32, 17 };
        InsertionSort insertionSort = new InsertionSort();
        System.out.println("Before sorting");
        insertionSort.printArray(arr);
        System.out.println();
        insertionSort.insertion(arr);
        System.out.println("After insertion sort");
        insertionSort.printArray(arr);
        System.out.println();
    }
    public void printArray(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public void insertion(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i-1;
            while (j >= 0 && temp <= arr[j]){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = temp;
        }
    }
}
