class Solution {
public:
    vector<int> sumEvenAfterQueries(vector<int>& arr, vector<vector<int>>& q) {
        // vector<int> ans;
        // for(int i=0;i<q.size();i++){
        //     int idx=q[i][1];
        //     arr[idx]+=q[i][0];
        //     long sum=0;
        //     for(int j=0;j<arr.size();j++){
        //         if(arr[j]%2==0){
        //             sum+=arr[j];
        //         }
        //     }
        //     ans.push_back(sum);
        // }
        // return ans;
        
        
        // OPTImize
        vector<int> ans;
        
        long orgSum=0;
        for(int i=0;i<arr.size();i++){
           orgSum+= (arr[i]%2==0) ? arr[i] : 0 ;
        }
        for(int i=0;i<q.size();i++){
            int idx=q[i][1];
            int prev=arr[idx];
            arr[idx]+=q[i][0];
            
            if(arr[idx]%2==0 && prev%2==0 ){
                orgSum+=arr[idx]-prev;
            }
            else if(arr[idx]%2==0)
                orgSum+=arr[idx];
            else if(prev%2==0)
                orgSum-=prev;
        
          ans.push_back(orgSum);
        }
        return ans;
    }
};