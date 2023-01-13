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
        int mid =  (start + end)/2;

        int len1 = mid - start + 1;
        int len2 = end - mid;
//        System.out.println("len2 = " + len2);
//        System.out.println("len1 = " + len1);
//
//        System.out.println("mid = " + mid);
        int firstArray[] = new int[len1];
        int secArray[] = new int[len2];

        for (int i = 0; i <len1 ; ++i) {
        firstArray[i] = arr[start + i];
        }
        for (int i = 0; i <len2 ; ++i) {
            secArray[i] = arr[mid+1 + i];
        }
        int initial_index1 = 0;
        int initial_index2 = 0;
        int ini_indx_merge = start;
        while ( initial_index1 < len1 &&  initial_index2 < len2){
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
            sort(arr,start,mid);
            sort(arr,mid+1,end);

            merge(arr,start,end);
        }
    }

}
