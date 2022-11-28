package arraypackage;

public class CountInversion {
    public static void main(String[] args) {
int[] arr = {8, 4, 2, 1};
int[] arr2 =  {3, 1, 2};
int res = inversionCount(arr, arr.length);
System.out.println("res = " + res);
System.out.println("inversionCount(arr2, arr2.length) = " + inversionCount(arr2, arr2.length));
    }
    public static int inversionCount(int[] arr,int size){
        int count = 0;
        for(int i = 0 ; i <size; i++){
            for(int j = i+1; j < size ; j++){
                if (arr[i] > arr[j]){
                    count ++;
                }
            }
        }
        return count;
    }
}
