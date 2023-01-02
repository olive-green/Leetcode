class Solution {
public:
    bool upperCase(string s){
        for(int i=0;i<s.size();i++){
            if(s[i]>=65 && s[i]<=90)
                continue;
            else
                return false;
        }
        return true;
    }
    bool lowerCase(string s){
        for(int i=0;i<s.size();i++){
            if(s[i]>=97 && s[i]<=122)
                continue;
            else
                return false;
        }
        return true;
    }
    bool detectCapitalUse(string word) {
        if(upperCase(word))
            return true;
        else if(lowerCase(word))
            return true;
        else if(isupper(word[0]) && lowerCase(word.substr(1)))
            return true;
        else 
            return false;
    }
};