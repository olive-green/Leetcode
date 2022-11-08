class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int currSum=nums[0],ans=nums[0];
        for(int i=1;i<nums.size();i++){
            if(currSum<0)
                currSum=0;
            currSum+=nums[i];
            ans=max(ans,currSum);
            
        }
        return ans;
    }
};