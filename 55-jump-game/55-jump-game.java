class Solution {
//     public boolean solve(int[] arr,int idx,int dest){
//         if(idx==dest)
//             return true;
//         if(idx>dest)
//             return false;
//         boolean ans=false;
//         for(int jump=1;jump<=arr[idx];jump++){
//             ans=solve(arr,idx+jump,dest);
//             if(ans==true)
//                 return true;
//         }
//         return ans;
//     }
//     public boolean canJump(int[] nums) {
        
//         return solve(nums,0,nums.length-1);
//     }
    
    //above solution give tle so we do it by dp memorization technique
    public boolean solve(int[] arr,int idx,int dest, int[] dp){
        if(idx>=dest)
            return true;
        
        if(dp[idx]!=-1)
            return dp[idx]==1;
        
        for(int jump=1;jump<=arr[idx];jump++){
            if(solve(arr,idx+jump,dest,dp)==true){
                dp[idx]=1;
                return true;
            }
                
        }
         dp[idx]=0;
        return false;
    }
    public boolean canJump(int[] nums) {
        int dp[]=new int[nums.length+1];
        Arrays.fill(dp,-1);//since we have to check our ans with true or false so cannot take boolean arrays as its default value is false
        return solve(nums,0,nums.length-1,dp);
    }
}