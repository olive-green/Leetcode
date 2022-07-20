class Solution {
public:
    void merge(vector<int>&nums,int low,int high,int mid){
        int n1=mid-low+1;
        int n2=high-mid;
        int lArray[n1];
        int rArray[n2];
        for(int i=0;i<n1;i++){
            lArray[i]=nums[i+low];
        }
        for(int i=0;i<n2;i++){
            rArray[i]=nums[i+mid+1];
        }
        int i=0,j=0,k=low;
        while(i<n1&& j<n2){
            if(lArray[i]<rArray[j]){
                nums[k++]=lArray[i++];
            }
            else
                nums[k++]=rArray[j++];
                
        }
        while(i<n1)
            nums[k++]=lArray[i++];
        while(j<n2)
            nums[k++]=rArray[j++];
            
            
    }
    void mSort(vector<int>&nums,int low,int high){
        if(low<high)
            
        { 
            int mid=(high+low)/2;
            mSort(nums,low,mid);
            mSort(nums,mid+1,high);
            merge(nums,low,high, mid);
        }
    }
    vector<int> sortArray(vector<int>& nums) {
        mSort(nums,0,nums.size()-1);
        return nums;
    }
};