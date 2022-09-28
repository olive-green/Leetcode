class Solution {
public:
    int maxProfit(vector<int>& p) {
        // int ans=0;
        // for(int i=0;i<p.size();i++){
        //     for(int j=i+1;j<p.size();j++){
        //         if(p[j]>p[i])
        //             ans=max(ans,p[j]-p[i]);
        //     }
        // }
        // return ans;
        int buy=p[0];
        int ans=0;
        for(int i=1;i<p.size();i++){
            if(p[i]<buy){
                buy=p[i];
                // ans=max(ans,p[i]-buy);
            }
            else 
                ans=max(ans,p[i]-buy);
        }
        return ans;
    }
};