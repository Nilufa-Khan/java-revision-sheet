public class BinarySearchRecursion {
    public static void main(String[] args){
        int[] arr = {2,3,4,6,8,9,78,89};
        int key = 78;
        int indexOfArray = binarySearch(arr,0 , arr.length-1,key);
        System.out.println("Element found at index = "+ indexOfArray);
    }
    public static int binarySearch(int[] arr, int first, int last, int key){

        if(first <= last){
            int mid = (first + last)/2;
            if(arr[mid] == key){
                return  mid;
            }
            else if(arr[mid]< key){
                return binarySearch(arr,mid+1,last,key);
            }else{
                return binarySearch(arr,first, mid-1,key);
            }
        }

        return -1;
    }
}
