class Solution {
    public int maxProfit(int[] prices) {
        //brute force
        // int ans=0;
        // for(int i=0;i<prices.length;i++){
        //     for(int j=i+1;j<prices.length;j++){
        //         if(prices[j]-prices[i]>0){
        //             ans=Math.max(ans,prices[j]-prices[i]);
        //         }
        //     }
        // }
        // return ans;
        
        
// Iterate over the prices array and check if the current price is minimum or not.
    // If the current price is minimum then buy on this ith day.
    // If the current price is greater than the previous buy then make profit from it and maximize the max_profit.
        
// Time complexity: O(n).
        int buyPrice=prices[0];
        int ans=0;
        for(int i=1;i<prices.length;i++){
            //current price is min than previous buyprice
            buyPrice=Math.min(buyPrice,prices[i]);
            //current price greater than the previous by
            ans=Math.max(ans,prices[i]-buyPrice);
        }
        return ans;
        
        
    }
}