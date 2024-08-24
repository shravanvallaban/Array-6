package Array-6;
// TC: O(N)
// SC: O(1)
public class Problem1 {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit=0;

        for(int i=1;i<prices.length;i++){
            if(prices[i] < min){
                min = prices[i];
            }

            if(prices[i] - min > maxProfit){
                maxProfit = prices[i] - min;
            }
        }

        return maxProfit;
    }
}
