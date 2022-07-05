class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        //1st approach
        // simple sum
//         first  we add the all numbers from 0 to n then subtract the sum of elements present in array = ie. our ans
        
        int totalSum= n*(n+1)/2;
        for(int num:nums)
            totalSum=totalSum-num;
        return totalSum;
        
    }
}