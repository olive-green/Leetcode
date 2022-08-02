class Solution {
    public int maxProfit(int[] prices) {
//         The idea is quite simple, we’ve to find the max profit by selling the stocks.
// We took 2 int variables: mn (to store the minimum till a particular date) & ans.
// Run a for loop and in every time check for the minimum value till that iteration and store it in mn ~min(mn, prices[i]).
// Also, find the ans with max(ans, prices[i]-mn).
// Time complexity: O(n).
        int min=Integer.MAX_VALUE;
        int ans=0;
        for(int i=0;i<prices.length;i++){
            min=Math.min(min,prices[i]);
            ans=Math.max(ans,prices[i]-min);
        }
        return ans;
    }
}