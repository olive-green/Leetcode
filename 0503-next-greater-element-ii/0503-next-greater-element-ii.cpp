class Solution {
public:
    vector<int> nextGreaterElements(vector<int>& arr) {
        stack<int> st;
        vector<int> ans(arr.size(),-1);
        int n=arr.size();
        for(int i=n*2-1;i>=0;i--){
             while(!st.empty() && arr[i%n]>=st.top())
                    st.pop();
            if(i<arr.size() && !st.empty()){
               
                    ans[i]=st.top();
            }
                
            st.push(arr[i%n]);
        }
        return ans;
    }
};