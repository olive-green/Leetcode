class Solution {
public:
    int searchInsert(vector<int>& arr, int t) {
        int i=0,j=arr.size()-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]==t)
                return mid;
            else if(arr[mid]<t){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
            // cout<<mid<<endl;
        }
        return i;
    }
};