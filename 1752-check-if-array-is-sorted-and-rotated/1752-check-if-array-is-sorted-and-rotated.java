class Solution {
    // public boolean isSorted(int[] nums){
    //     boolean flag=true;
    //     for(int i=0;i<nums.length;i++){
    //         if(nums[i]>nums[i+1])
    //             flag=false;
    //     }
    //     return flag;
    // }
    public boolean check(int[] A) {
        // int smallestElementIndx=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[smallestElementIndx]>nums[i])
        //         smallestElementIndx=i;
        // }
        // int k=smallestElementIndx%nums.length;
        // for(int i)
        int k = 0, n = A.length;
        for (int i = 0; i < n; ++i) {
            if (A[i] > A[(i + 1) % n]) {
                k++;
            }
            if (k > 1) {
                return false;
            }
        }
        return true;
    }
}