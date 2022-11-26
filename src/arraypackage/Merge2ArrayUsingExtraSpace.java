package arraypackage;

import static java.util.Arrays.sort;

public class Merge2ArrayUsingExtraSpace {
    public static void main(String[] args) {
        int[] arr1 = {4,6,8,9,11};
        int[] arr2 = {1,2,3,5,7,10};
        int[] newRes = merge2SortedArray(arr1,arr2);
        sort(newRes);
        for(int val : newRes){
            System.out.print(val+" ");
        }

    }
    public static int[] merge2SortedArray(int[] arr1, int[] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;
        int size = n1 + n2;
        int merge[] = new int[size];
        for(int i = 0 ; i < arr1.length;i++){
            merge[i] = arr1[i];
        }
        for(int i = 0 ; i < arr2.length; i++){
            merge[arr1.length + i] = arr2[i];
        }

        return merge;
    }
}
