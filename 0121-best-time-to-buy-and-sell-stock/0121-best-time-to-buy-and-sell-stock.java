class Solution {
    public int maxProfit(int[] prices) {
        
        int left=0;
        int right=1;
        int max_profit=0;
        while(right<prices.length)
        {
            if(prices[left] < prices[right])
            {
                int current_profit= prices[right]-prices[left];
                
                max_profit = Math.max(max_profit, current_profit);
            }
            else
            {
                left=right;
            }
            right++;
        }
        return max_profit;
        
        
    }
}