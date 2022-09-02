class Solution {
    public int maxProfit(int[] p) {

        //you can think of buying on one day and selling on adjacent day then you get the ans
        // int ans=0;
        // for(int i=0;i<p.length-1;i++){
        //     if(p[i+1]-p[i]>0){
        //         ans+=p[i+1]-p[i];
        //     }
        // }
        // return ans;
        
        // One more way to solve the problem is to think of the situation when we buy the stocks in the beginning of the upstreak in the stock graph and sell it at the highest point of that upstreak line of the graph. We just have to calculate the sum of all the upstreaks that are present in the graph.
        int buyDate=0;
        int sellDate=0;
        
        int ans=0;
        for(int i=1;i<p.length;i++){
            if(p[i]>=p[i-1]){
                sellDate++;
            }
            else{
                ans+=p[sellDate]-p[buyDate];
                sellDate=buyDate=i;
            }
        }
        //incase when array is increasing order
        ans+=p[sellDate]-p[buyDate]; //sellDate is last ele and buydate is first element
        return ans;
        
        
    }
}