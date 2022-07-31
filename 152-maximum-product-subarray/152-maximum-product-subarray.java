class Solution {
    public int maxProduct(int[] nums) {
// Calculate prefix product in A.
// Calculate suffix product in B.
// Return the max.
//         Detailed Explanation:
// A lot of people asked about why can we get the max by calculating the products from start and end, Here is all you should know:
// First, Consider there is no zero, and if we get the products of all the numbers:
// 1) We will have a negative result if there are odd numbers of negative -> max ((product of (0, last negative)), (product of (first negative, last num))
// 2) We will have a positive result if there are even numbers of negative -> product of all the numbers
// Above all, we can get the max by going through the array from both start and end, then we won't miss any situations
// If there is a zero, that means we would have two subproblems(unless the zero is at index 0 or last index), if two zeros, 3 subs, all the way up. We still can calculate from the very beginning and end at the same time, then we would get the result.
        //using kadanes algo
        int prefix=1;
        int suffix=1;
        int ans=nums[0];
        for(int i=0;i<nums.length;i++){
            prefix=prefix==0 ? 1 : prefix; //when prefix product becomes zero
            prefix*=nums[i];
            suffix=suffix==0 ? 1 : suffix;
            suffix*=nums[nums.length-1-i];
            ans=Math.max(ans,Math.max(prefix,suffix));
        }
        return ans;
        
    }
}