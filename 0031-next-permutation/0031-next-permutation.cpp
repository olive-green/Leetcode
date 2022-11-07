class Solution {
public:
    void nextPermutation(vector<int>& nums) {
//         Step 1: Linearly traverse array from backward such that ith index value of the array is less than (i+1)th index value. Store that index in a variable.

// Step 2: If the index value received from step 1 is less than 0. This means the given input array is the largest lexicographical permutation. Hence, we will reverse the input array to get the minimum or starting permutation. Linearly traverse array from backward. Find an index that has a value greater than the previously found index. Store index is another variable.

// Step 3: Swap values present in indices found in the above two steps.

// Step 4: Reverse array from index+1 where the index is found at step 1 till the end of the array.
        int i=0;
        int n=nums.size();
        for(i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                break;
            }           
        }
        //swap firstleft and first right
        if(i<0)
            reverse(nums.begin(),nums.end());
        else{
            //now find the element just greater than ith element and swap them
            int j;
            for(j=n-1;j>=0;j--){
                if(nums[j]>nums[i]){
                    break;
                }      
            }
            swap(nums[i],nums[j]);
        reverse(nums.begin()+i+1,nums.end());
        }
        
            
        
    }
};