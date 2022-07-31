class Solution {
    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    //we cannot use below function bcz java passes by value
    // public void swap(int a,int b){
    //     int temp=a;
    //     a=b;
    //     b=temp;
    // }
    public void sortColors(int[] nums) {
        //we'll bring 0 on left side and 2 on right side 
        // int low=0,mid=0,high=nums.length-1;
        // while(mid<=high){
        //     switch(nums[mid]){
        //         case 0: swap(nums,low,mid);
        //             mid++;
        //             low++;
        //             break;
        //         case 1:
        //             mid++;
        //             break;
        //         case 2:
        //             swap(nums,mid,high);
        //             high--;
        //             break;
        //     }
        // }
        
        //now using counting sort
        int count0=0,count1=0,count2=0;
        for(int e:nums){
            if(e==0)
                count0++;
            else if(e==1)
                count1++;
            else
                count2++;
        }
        for(int i=0;i<nums.length;i++){
            if(i<count0)  nums[i]=0;
            else if(i<count0+count1)    nums[i]=1;
            else
                nums[i]=2;
        }
    }
}