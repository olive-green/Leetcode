class Solution {
    public int findNumbers(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int totalDigit=(int)Math.floor(Math.log10(nums[i])+1);
            if(totalDigit%2==0)
                ans++;
        }
        return ans;
    }
}