class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        //1st approach
        // simple sum
//         first  we add the all numbers from 0 to n then subtract the sum of elements present in array = ie. our ans
        
        // int totalSum= n*(n+1)/2;
        // for(int num:nums)
        //     totalSum=totalSum-num;
        // return totalSum;
        
        //2nd approach
        // using hashtable
        // HashSet<Integer> set=new HashSet<>();
        // for(int i=0;i<n;i++)
        //     set.add(nums[i]);
        // for(int i=0;i<n;i++){
        //     if(!set.contains(i))
        //         return i;
        // }
        // return n;
        
        //3rd approach using XOR
        // we know a^a=0, if we do [0,1,3] ^ [0,1,2,3]= 2
        int xor=0,i=0;
        for(i=0;i<n;i++){
            xor^=nums[i]^i; //here i is for 0 to n-1;
        }
        return xor^i; //this last xor is for number n
        
    }
}