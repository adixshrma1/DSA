package _04Arrays1;

public class _06BuyAndSellStocks {
    private static int findMaxProfit(int[] arr){
        int buy = arr[0];
        int maxProfit = 0;
        for (int i = 1; i < arr.length; i++) {
            int currentProfit = arr[i] - buy;
            maxProfit = Math.max(maxProfit, currentProfit);
            buy = Math.min(buy, arr[i]);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,6,3,2};
        System.out.println(findMaxProfit(prices));
    }
}
