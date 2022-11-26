package arraypackage;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class Merge2SortedArrayWithOutUsingExtraSpace {
    public static void main(String[] args) {
        int[] arr1 = {4,6,8,9,11};
        int[] arr2 = {1,2,3,5,7,10};
        mergeArray(arr1,arr2);
        System.out.println("After merging");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
    public static void mergeArray(int[] arr1, int arr2[]){
        int temp = 0;
        int i = 0;
        while(arr1[arr1.length-1] > arr2[0]){
            if(arr1[i] > arr2[0]){
                temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;
                sort(arr2);
            }
            i++;
        }
    }
}
