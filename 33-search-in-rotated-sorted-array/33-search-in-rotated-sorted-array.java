class Solution {
    public int binarySearch(int[]arr,int i,int j,int target){
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]<target)
                i=mid+1;
            else
                j=mid-1;
        }
        return -1;
    }
    public int search(int[] arr, int target) {
        //since it is sorted rotated array then there is a single index where it is decreasing and we have to find that index where it is rotated so that we can get our original sorted array
        int n=arr.length;
        int idx=-1;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                 idx=i;
                break;
            }
        }     
        if(idx!=-1){
            int temp=binarySearch(arr,0,idx,target);
            if(temp!=-1)
                return temp;
            temp=binarySearch(arr,idx+1,n-1,target);
            return temp;
        }
        return binarySearch(arr,0,n-1,target);

    }
}