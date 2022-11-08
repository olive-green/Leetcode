class Solution {
public:
    int maxAbsoluteSum(vector<int>& nums) {
        //the key idea here is the max absolute sum can either be maximum sum or minmum sum
        //so we use kadane algo to find maxsum and minsum and compare both of them
        
        int maxSum=INT_MIN,currSum=0;
        int minSum=INT_MAX,mini=0;
        for(int i=0;i<nums.size();i++){
            currSum+=nums[i];
            maxSum=max(maxSum,currSum);
            mini+=nums[i];
            minSum=min(minSum,mini);
            if(currSum<0)
                currSum=0;
            if(mini>0)
                mini=0;
        }
        return max(abs(minSum),abs(maxSum));
    }
};