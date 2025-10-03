class Solution {
    public int maxProfit(int[] prices) {
        int num = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i =0; i<prices.length; i++) {
            if(prices[i] < num) {
                num = prices[i];
            }
            maxprofit = Math.max(maxprofit,prices[i]-num);
        }
        return maxprofit;
    }
}
