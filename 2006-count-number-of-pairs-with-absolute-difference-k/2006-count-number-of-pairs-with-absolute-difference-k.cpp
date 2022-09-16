class Solution {
public:
    int countKDifference(vector<int>& arr, int k) {
        int ans=0;
        // for(int i=0;i<arr.size();i++){
        //     for(int j=i+1;j<arr.size();j++){
        //         if(abs(arr[i]-arr[j])==k){
        //             ans++;
        //         }
        //     }
        // }
        
        unordered_map<int,int> mp;
        for(int i=0;i<arr.size();i++){
            if(mp.find(arr[i]-k)!=mp.end())
                ans+=mp[arr[i]-k];
            if(mp.find(arr[i]+k)!=mp.end())
                ans+=mp[arr[i]+k];
            mp[arr[i]]++;
        }
        return ans;
    }
};