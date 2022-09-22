class Solution {
public:
    void reverseWord(string & s,int i,int j){
        // int i=0;
        // int j=s.length()-1;
        while(i<j){
            swap(s[i],s[j]);
            i++;
            j--;
        }
    }
    string reverseWords(string s) {
        int j=0;
        for(int i=0;i<s.length();i++){
            
            if(s[i]==' '){
                reverseWord(s,j,i-1);
                j=i+1;
            }
            else if(i==s.length()-1){
                reverseWord(s,j,i);
            }
        }
        return s;
    }
};