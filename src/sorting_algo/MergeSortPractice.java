package sorting_algo;

public class MergeSortPractice {
    public static void main(String[] args) {
        int arr[] = {2,1,34,12,45,21,11,1,07,45,99};
        sort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void merge(int[] arr, int start , int end){
        
//        finding mid of the array
        int mid =  (start + end)/2;
// declaring and initializing length of the two array
        int len1 = mid - start + 1;
        int len2 = end - mid;
// declaring two array

        int firstArray[] = new int[len1];
        int secArray[] = new int[len2];
// copy paste values from the main array to the newly created array
        for (int i = 0; i <len1 ; ++i) {
        firstArray[i] = arr[start + i];
        }
        // copy paste values from the main array to the newly created array
        for (int i = 0; i <len2 ; ++i) {
            secArray[i] = arr[mid+1 + i];
        }
//        initial index of two sub arrays
        int initial_index1 = 0;
        int initial_index2 = 0;
//        initial index of merged array

        int ini_indx_merge = start;
//        checking the condition whether the starting index of each array is less than ending index or not
        while ( initial_index1 < len1 &&  initial_index2 < len2){
//            checking each arrays value whether its small or equals
            if(firstArray[initial_index1] <= secArray[initial_index2]){
                arr[ini_indx_merge] = firstArray[initial_index1];
                initial_index1++;
            }else{
                arr[ini_indx_merge] = secArray[initial_index2];
                initial_index2++;
            }
            ini_indx_merge++;
        }
        while ( initial_index1 < len1){
            arr[ini_indx_merge] = firstArray[initial_index1];
            initial_index1++;
            ini_indx_merge++;
        }
        while ( initial_index2 < len2){
            arr[ini_indx_merge] = secArray[initial_index2];
            initial_index2++;
            ini_indx_merge++;
        }



    }
    public static  void sort(int[] arr, int start, int end){
        if(start < end){
//            find middle
            int mid = (start+end)/2;
//            sort the first and second half of the array
            sort(arr,start,mid);
            sort(arr,mid+1,end);
//merge the sorted halves
            merge(arr,start,end);
        }
    }

}
