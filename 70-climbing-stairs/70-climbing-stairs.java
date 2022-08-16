class Solution {
    public int helper(int[] dp, int n){
        if(n<=2) 
            return dp[n]=n;
        
        if(dp[n]!=-1){
            return dp[n];
        }
        int ans=helper(dp,n-1) + helper(dp,n-2);
        return dp[n]= ans;
    }
    public int climbStairs(int n) {
        //using dp
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        
        return helper(dp,n);
    }
}