class Solution {
public:
    bool helper(string s,string t){
        unordered_map<char,char> mp1;
        bool ans=true;
        for(int i=0;i<s.size();i++){
            if(mp1.find(s[i])!=mp1.end()){
                if(mp1[s[i]]!=t[i])
                    ans=false;
            }
            mp1[s[i]]=t[i];
        }
        return ans;
    }
    bool isIsomorphic(string s, string t) {
        
        return helper(s,t) && helper(t,s);  //this second calling for this type ex: "badc"
// "baba"
    }
};