package sorting_algo;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        MergeSort m1 = new MergeSort();
        m1.sort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    void sort(int arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }



}
//    public static void mergeSort(int[] arr, int left , int right){
//
//        if(left < right) {
//            //  merge the left side of the array
//            int mid = (left + right) / 2;
//            mergeSort(arr, left, mid);
//
//            // merge the right side of the array
//            mergeSort(arr, mid + 1, right);
//
//            // merge two array
//            merge(arr, left, right);
//        }
//    }
//    public static void merge(int[] arr, int left, int right){
//        int mid = (left + right)/2;
//        int lengthOfArray1 = mid - left + 1;
//        int lengthOfArray2= right - mid;
//        int leftArray[] = new int[lengthOfArray1];
//        int rightArray[] = new int[lengthOfArray2];
//
//
//        for (int i = 0; i <lengthOfArray1 ; i++) {
//            leftArray[i] = arr[left+i];
//
//        }
//
//        for (int i = 0; i <lengthOfArray1 ; i++) {
//            rightArray[i] = arr[mid+1+i];
//
//        }
//        int index1=0;
//        int index2 = 0;
//        int arrayIndex=left;
//        while (index1 < lengthOfArray1 && index2 < lengthOfArray2){
//            if(leftArray[index1] <= rightArray[index2]){
//                arr[arrayIndex] = leftArray[index1];
//                index1++;
//            }else{
//                arr[arrayIndex] = rightArray[index2];
//                index2++;
//            }
//            arrayIndex++;
//        }
//        while (index1 < lengthOfArray1){
//            arr[arrayIndex] = leftArray[index1];
//            index1++;
//            arrayIndex++;
//        }
//        while (index2 < lengthOfArray2){
//            arr[arrayIndex] = rightArray[index2];
//            index1++;
//            arrayIndex++;
//        }
//
//
//    }
//}
