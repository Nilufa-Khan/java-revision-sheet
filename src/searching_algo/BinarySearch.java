package searching_algo;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 50, 60, 80, 110, 130, 140, 170};
        int indexOfTheElement = binary(arr,0, arr.length-1,110);
        System.out.println("indexOfTheElement = " + indexOfTheElement);
        int indexOfTheElement1 = binary(arr,0, arr.length-1,175);
        System.out.println("indexOfTheElement1 = " + indexOfTheElement1);
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
}
