class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int maxp = 0;

        for(int i=0;i<prices.length;i++){
            if(buy > prices[i]){
                buy = prices[i];
            }

            int profit = prices[i] - buy;
            if(profit > maxp){
                maxp = profit;
            }
        }
        return maxp;

    }
}