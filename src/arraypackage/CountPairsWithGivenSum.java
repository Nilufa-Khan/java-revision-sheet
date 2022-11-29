package arraypackage;
//Input:
//Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K.
//        N = 4, K = 6
//        arr[] = {1, 5, 7, 1}
//        Output: 2
//        Explanation:
//        arr[0] + arr[1] = 1 + 5 = 6
//        and arr[1] + arr[3] = 5 + 1 = 6.
public class CountPairsWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1};
        int[] arr2 = {1, 5, 7, 1};
        System.out.println("countPairsWithGivenSum(arr,6) = " + countPairsWithGivenSum(arr, 2));
        System.out.println("countPairsWithGivenSum(arr2,2) = " + countPairsWithGivenSum(arr2, 6));

    }
    public static int countPairsWithGivenSum(int[] arr, int k){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i +1; j < arr.length ; j++) {
                if((arr[i]+arr[j]) == k){
                    count ++;
                }
            }
        }
        return count;
    }
}
