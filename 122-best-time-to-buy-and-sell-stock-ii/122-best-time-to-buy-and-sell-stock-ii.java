class Solution {
    public int maxProfit(int[] p) {
//         int i = 0, buy, sell, profit = 0, N = prices.length - 1;
//         while (i < N) {
//             while (i < N && prices[i + 1] <= prices[i]) i++;
//             buy = prices[i];

//             while (i < N && prices[i + 1] > prices[i]) i++;
//             sell = prices[i];

//             profit += sell - buy;
//         }
//         return profit;
        
        //you can think of buying on ond day and selling on adjacent day then you get the ans
        int ans=0;
        for(int i=0;i<p.length-1;i++){
            if(p[i+1]-p[i]>0){
                ans+=p[i+1]-p[i];
            }
        }
        return ans;
    }
}