class Solution {
    public int maxSubArray(int[] nums) {
        
        int ans=nums[0];
        int tempSum=0;
        for(int i=0;i<nums.length;i++){
            tempSum+=nums[i];
            ans=Math.max(ans,tempSum);
            if(tempSum<0)
                tempSum=0;
           
        }
        return ans;
    }
}