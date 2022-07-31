class Solution {
    public void reverse(int[] nums,int i,int j){
        while(i<j){
            // swap(nums[i++],nums[j--]);
            int temp=nums[i];
            nums[i++]=nums[j];
            nums[j--]=temp;
        }
    }
    public void rotate(int[] nums, int k) {
        //logic is simple first we reverse first n-k numbers and second half's k numbers then reverse the whole array
        int n=nums.length;
        
        if(n==1)
            return;
        // k=k%n;
        // reverse(nums,0,n-k-1);
        // // for(int i=0;i<n;i++)
        // //     System.out.print(nums[i]+"\t");
        // reverse(nums,n-k,n-1);
        // reverse(nums,0,n-1);
        
        //O(n)soln with O(n) space
        int[] copy=new int[n];
        for(int i=0;i<n;i++){
            copy[i]=nums[i];
        }
        //now store the ans in nums
        for(int i=0;i<n;i++){
            nums[(i+k)%n]=copy[i];
        }
        
    }
}