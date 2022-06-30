class Solution {
    public int minMoves2(int[] nums) {
        // long sum=0;
        // for(int i=0;i<nums.length;i++){
        //     sum+=nums[i];
        // }
        // long avg=Math.round((double)sum/(double)nums.length);
        // int average=(int)avg;
        // int ans=0;
        // for(int i=0;i<nums.length;i++){
        //     ans+=Math.abs(average-nums[i]);
        // }
        // return ans;
        //above one is wrong solution
        
        int n = nums.length, steps = 0;
        Arrays.sort(nums);
        int median = nums[n/2]; // Finding median
        for(int i=0; i<n; i++){
            steps += Math.abs(nums[i] - median); //Adding absolute difference
        }
        return steps;
    }
}