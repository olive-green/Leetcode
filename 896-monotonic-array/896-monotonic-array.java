class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc=true,dec=true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                inc=false;
            }
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                dec=false;
            }
        }
        if(inc || dec)
            return true;
        return false;
    }
}