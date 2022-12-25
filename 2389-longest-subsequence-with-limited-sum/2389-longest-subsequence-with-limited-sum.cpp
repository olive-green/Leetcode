class Solution {
public:
    vector<int> answerQueries(vector<int>& nums, vector<int>& q) {
        vector<int> dummy;
        dummy=nums;
        sort(dummy.begin(),dummy.end());   
        for(int i=1;i<nums.size();i++){
            dummy[i]+=dummy[i-1];
        }
        
        vector<int> ans(q.size());
        for(int i=0;i<q.size();i++){
            //now use binary search to find the q in prefix sum and return the idx+1
            int tar=q[i];
            int low=0,high=nums.size()-1;
            
            while(low<=high){
                int mid=(low+high)/2;
                if(dummy[mid]==tar){
                    ans[i]= mid+1;
                    break;
                }
                else if(dummy[mid]<tar){
                    ans[i]=mid+1;
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        
        }
        return ans;
    }
};