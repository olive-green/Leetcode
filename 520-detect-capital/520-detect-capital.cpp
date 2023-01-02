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
        // if(upperCase(word))
        //     return true;
        // else if(lowerCase(word))
        //     return true;
        // else if(isupper(word[0]) && lowerCase(word.substr(1)))
        //     return true;
        // else 
        //     return false;
        
//         Approach:

//     Initialize count=0
//     if count equals 0 means all are small chars
//     if count equals size of word then all are capital
//     if count equals 1 then check is it the first char which is capital  ex- "ffffffffffffffffffffF"
//     if none of the conditions are true then return false
        int count=0;
        if(word.size()==1)
            return true;
        
        for(int i=0; i<word.size(); i++)
            if(isupper(word[i]))
                count++;
        
        if(count==1 && isupper(word[0]))
            return true;
        if(count==0 || count==word.size())
            return true;
        else
            return false;


    }
    
};