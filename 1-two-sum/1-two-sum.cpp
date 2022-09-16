class Solution {
public:
    vector<int> twoSum(vector<int>& arr, int target) {
        //binary search logic
        //we first trying to find the target = nums[i]+ nums[j] in array if get return that
        //copy the array
        vector<int> v(arr);
        //sort the array
        sort(arr.begin(),arr.end());
        int i=0,j=arr.size()-1;
        int ans1,ans2;
        while(i<=j){
            if(arr[i]+arr[j]==target){
                ans1=arr[i];
                ans2=arr[j];
                break;
            }
            else if(arr[i]+arr[j]<target){
                i++;
            }
            else
                j--;
        }
        
        vector<int>ans;
        //now find the original position of these elements
        for(int i=0;i<arr.size();i++){
            if(v[i]==ans1)
                ans.push_back(i);
            else if(v[i]==ans2)
                ans.push_back(i);
        }
        
        return ans;
       
    }
};