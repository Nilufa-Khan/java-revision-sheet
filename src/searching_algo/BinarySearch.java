package searching_algo;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 50, 60, 80, 110, 130, 140, 170};
//        Iterative approach
        System.out.println("Iterative approach");
        int indexOfTheElement = binary(arr,0, arr.length-1,110);
        System.out.println("indexOfTheElement = " + indexOfTheElement);
        int indexOfTheElement1 = binary(arr,0, arr.length-1,175);
        System.out.println("indexOfTheElement1 = " + indexOfTheElement1);
//        Recursive approach
        System.out.println("Recursive approach");
        int indexOfTheElement2 = binaryRecursiveSearch(arr,0, arr.length-1,110);
        System.out.println("indexOfTheElement = " + indexOfTheElement2);
        int indexOfTheElement3 = binaryRecursiveSearch(arr,0, arr.length-1,175);
        System.out.println("indexOfTheElement1 = " + indexOfTheElement3);
    }
    // solve the problem using iterative approach
    public static  int binary(int[] arr , int low , int high, int searchElement){
        int index = -1;
        while (low <= high) {


            int mid = (low + high) / 2;

            if (arr[mid] == searchElement) {
                index = mid;
            }
            if (arr[mid] < searchElement) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
       return index;
    }

//    solve the problem using recursive approach
    public static int binaryRecursiveSearch(int[] arr , int low , int high, int searchElement){

        if(low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == searchElement) {
                return mid;
            } else if (arr[mid] < searchElement) {
              return   binaryRecursiveSearch(arr, mid + 1, high, searchElement);
            } else {
               return binaryRecursiveSearch(arr, low, mid - 1, searchElement);
            }
        }

        return -1;
    }
}
