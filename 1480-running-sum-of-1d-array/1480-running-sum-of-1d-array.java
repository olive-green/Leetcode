class Solution {
    
    public int[] runningSum(int[] nums) {
               
//         // int[] ans= new int[nums.length];
//         // ans[0]=nums[0];
//         // // helper(nums,ans);
//         // for(int i=1;i<nums.length;i++){
//         //     ans[i]=ans[i-1]+nums[i];
//         // }
//         // return ans;
        
 
//         for(int i=1;i<nums.length;i++){
//             nums[i]+=nums[i-1];
//         }
//         return nums;
        for(int i=1;i<nums.length;i++){
            nums[i]+=nums[i-1];
        }
        return nums;
    }
}