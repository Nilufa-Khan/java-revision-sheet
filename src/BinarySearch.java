public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {2,3,4,6,8,9,78,89};
        int key = 8;
        binarySearch(arr,0, arr.length-1,key );
    }
    public static void binarySearch(int[] arr, int first, int last, int key){
//        int mid = (first + last)/2;

        while (first <= last) {
            int mid = (first + last)/2;
            if (arr[mid] < key) {
                first = mid + 1;
            } else if (arr[mid] == key) {
                System.out.println("Element found at index = " + mid);
                break;
            } else {
                last = mid - 1;
            }
//            mid = (first + last)/2;
        }
        if(first > last){
            System.out.println("Not found");
        }
    }
}
