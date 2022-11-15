class Solution {
public:
    int trap(vector<int>& h) {

       //Approach
        // At particular height we checks it Max left and max right then find the min of both
        //     and subtract it from current height
        int ans=0;
        vector<int> leftMax(h.size(),0);
        vector<int> rightMax(h.size(),0);
        for(int i=1;i<h.size();i++){
            leftMax[i]=max(leftMax[i-1],h[i-1]);
        }
        for(int j=h.size()-2;j>=0;j--){
               rightMax[j]=max(rightMax[j+1],h[j+1]);
        }   
        for(int i=0;i<h.size();i++){
            if(min(leftMax[i],rightMax[i])-h[i]>0)
               ans+=min(leftMax[i],rightMax[i])-h[i];
            }
        return ans;
    }
};