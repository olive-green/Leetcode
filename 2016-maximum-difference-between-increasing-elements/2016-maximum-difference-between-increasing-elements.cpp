class Solution {
public:
    int maximumDifference(vector<int>& nums) {
        int mini=nums[0],ans=-1;
        for(int i=1;i<nums.size();i++){
            if(nums[i]>mini){
                ans=max(ans,nums[i]-mini);
            }
            else
                mini=nums[i];
        }
        return ans;
    }
};