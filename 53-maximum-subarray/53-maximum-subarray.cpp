class Solution {
public:
    int maxSubArray(vector<int>& arr) {
        int currSum=0,ans=INT_MIN;
        for(int i=0;i<arr.size();i++){
            currSum+=arr[i];
            ans=max(currSum,ans);
            if(currSum<0)
                currSum=0;
            
        }
        return ans;
    }
};