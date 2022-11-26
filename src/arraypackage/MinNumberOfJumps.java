package arraypackage;

import static java.lang.Math.max;
import static java.util.Arrays.deepToString;
import static java.util.Arrays.sort;

public class MinNumberOfJumps {
    public static void main(String[] args) {
        MinNumberOfJumps minNumberOfJumps = new MinNumberOfJumps();
        int arr[] = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
        int n = arr.length;
        System.out.print(
                "Minimum number of jumps to reach end is "
                        + minNumberOfJumps.minNoOfJumpsToReachEndOfTheArray(arr, n));
    }
    public int minNoOfJumpsToReachEndOfTheArray(int[] arr,int n){
    //base case
      if(n<=1){
          return 0;

      }
      if(arr[0] == 0){
          return -1;
      }
      int maxReach = arr[0];
      int steps = arr[0];
      int jumps = 1;
        for (int i = 1; i <n ; i++) {
            if(i == n-1){
                return jumps;
            }

            maxReach = max(maxReach, i + arr[i]);
            steps--;

            if(steps == 0) {
                jumps++;

                if (i >= maxReach) {
                    return -1;


                }
                steps = maxReach - i;
            }

        }
        return -1;
    }
}
