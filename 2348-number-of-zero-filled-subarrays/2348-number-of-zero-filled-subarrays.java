class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long totalZero=0;
        for(int i=0;i<nums.length;i++){
            long count=0;
            if(nums[i]!=0) continue;
           while(i<nums.length&&nums[i]==0){
                    // System.out.println(count);
                    i++;
                    count++;
                }
            
            // System.out.println(count);
           
             totalZero+=count*(count+1)/2;
        }
        return totalZero;
    }
}