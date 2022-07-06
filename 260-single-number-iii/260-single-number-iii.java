class Solution {
    public int[] singleNumber(int[] nums) {
        if(nums.length==2) return nums;
        int n1=0,n2=0;
        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor^=nums[i];
        }
        int rsb=xor &(-xor);
        for(int i=0;i<nums.length;i++){
            if((nums[i]&rsb)==0)
                n1^=nums[i];
            else
                n2^=nums[i];
        }
        return new int[] {n1,n2};
    }
}