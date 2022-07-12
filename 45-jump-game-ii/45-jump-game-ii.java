class Solution {
    // public int solve(int[] arr, int idx,int dest){
    //     if(idx==dest)
    //         return 0; //because from dest to dest there is 0 steps
    //     if(idx>dest)
    //         return dest+1;
    //     int ans= dest+1;
    //     for(int jump=1;jump<=arr[idx];jump++){
    //         ans=Math.min(ans,solve(arr,idx+jump,dest));
    //     }
    //     return ans+1;
    // }
    // public int jump(int[] arr) {
    //     int ans=solve(arr,0,arr.length-1) ;
    //     return ans;
    // }
    
    //above solution give runtime error so we use DP
    public int solve(int[] arr, int idx,int dest,int[] dp){
        if(idx==dest)
            return 0; //because from dest to dest there is 0 steps
        if(idx>dest)
            return dest+1;
        if(dp[idx]!=0)
            return dp[idx];
        int ans= dest+1;
        for(int jump=1;jump<=arr[idx];jump++){
            ans=Math.min(ans,solve(arr,idx+jump,dest,dp));
        }
        
        return dp[idx]=ans+1;
    }
    public int jump(int[] arr) {
        int[] dp= new int[arr.length];
        int ans=solve(arr,0,arr.length-1,dp) ;
        return ans;
    }
}