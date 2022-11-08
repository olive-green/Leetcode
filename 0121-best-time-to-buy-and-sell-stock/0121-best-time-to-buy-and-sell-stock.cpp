class Solution {
public:
    int maxProfit(vector<int>& prices) {
        //we maintain a minimum var and check if there is greater element than min then we update our ans by max(ans,no-min) else we update our min by that element
        int mini=prices[0],ans=0;
        for(int i=0;i<prices.size();i++){
            if(mini<prices[i]){
                ans=max(ans,prices[i]-mini);
            }
            else
                mini=prices[i];
        }
        return ans;
    }
};