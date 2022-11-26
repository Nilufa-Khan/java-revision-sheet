package arraypackage;

//Input: nums = [1,3,4,2,2]
//        Output: 2
//        Example 2:
//There is only one repeated number in nums, return this repeated number.
//        Input: nums = [3,1,3,4,2]
//        Output: 3

public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        int[] arr2 = {1,4,5,5,6,7};

        FindTheDuplicateNumber findTheDuplicateNumber = new FindTheDuplicateNumber();

        System.out.println("The  Duplicate  Number = " + findTheDuplicateNumber.repeatedNumber(arr));
        System.out.println("The  Duplicate  Number = " + findTheDuplicateNumber.repeatedNumber(arr2));

    }

    public int repeatedNumber(int[] arr) {
        int result = 0;

        for (int i = 0; i < arr.length-1; i++) {

            if((arr[i] ^ arr[i + 1]) == 0){
                result = arr[i];
            }
        }
        return result;
    }
}
