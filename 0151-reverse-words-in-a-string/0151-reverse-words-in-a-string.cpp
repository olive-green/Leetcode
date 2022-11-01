class Solution {
public:
    string reverseWords(string str) {
           // Write your code here.
    str+=" ";
    string ans="";
    stack<string> st;
    string temp="";
    for(int i=0;i<str.size();i++){
        if(str[i]!=' '){
            temp+=str[i];
        }
        else{
            if(temp.size()>0)
               st.push(temp);
            temp="";
        }
    }
    //now the string whose end doesn't contain space is not pushes last word into stack so we check here
    // if(str[str.size()-1]!=' ')
    //     st.push(temp);
    //now making our answer
    while(st.size()>1){
        ans+=st.top()+" ";
        st.pop();
    }
    return ans+=st.top();
    }
};
