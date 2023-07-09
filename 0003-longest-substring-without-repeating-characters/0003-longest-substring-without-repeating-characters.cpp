class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        unordered_map<char,int> mp;
        int i=0,j=0;
        int ans=0;
        int temp=0;
        // cout<<s.size()<<endl;
        while(j<s.size()){
            if(mp.find(s[j])==mp.end()){
                mp[s[j]]=j;
                temp++;
                j++;
            }
            else{
                
                temp=0;
                i=mp[s[j]]+1;
                j=i;
                mp.clear();
            }
            ans=max(ans,temp);
        }
        return ans;
    }
};