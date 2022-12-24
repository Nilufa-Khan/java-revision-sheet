package sorting_algo;
import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter index values");
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Before Sorting");
        for(int i = 0 ; i < arr.length ; i ++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        bubbleSort(arr);
    }
    public static void bubbleSort(int[] arr){
        for(int i = 0 ; i < arr.length ; i ++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    //swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // print sorted array
        System.out.println("After Bubble Sorting");
        for(int i = 0 ; i < arr.length ; i ++){
            System.out.print(arr[i]+" ");
        }
    }
}
