package arraypackage;
//Input: prices = [7,1,5,3,6,4]
//        Output: 5
//        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//        Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.


public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {

        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println("display Best Time To Buy And Sell Stock (arr) = " + displayBestTimeToBuyAndSellStock(arr));
        int[] arr2 = {7,6,4,3,1};
        System.out.println("display Best Time To Buy And Sell Stock (arr2) = " + displayBestTimeToBuyAndSellStock(arr2));


    }

    public static int displayBestTimeToBuyAndSellStock(int[] prices) {
        int max_Current_Value = 0;
        int max_Value_Found_So_Far = 0;

        for (int i = 1; i < prices.length; i++) {
            max_Current_Value = Math.max(0,max_Current_Value += prices[i]-prices[i-1]);
            max_Value_Found_So_Far = Math.max(max_Value_Found_So_Far,max_Current_Value);
        }
        return max_Value_Found_So_Far;
    }
}
