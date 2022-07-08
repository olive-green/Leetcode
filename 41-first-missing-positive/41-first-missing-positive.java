class Solution {
    public int firstMissingPositive(int[] nums) {
        if(nums.length==1 && nums[0]==1)
            return 2;
        HashSet<Integer> set=new HashSet<Integer>();
        int max=0;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            max=Math.max(max,nums[i]);
        }
        for(int i=1;i<nums.length;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        //the main thing to notice here is ans is within in range 1..n+1;
        return max==nums.length?nums.length+1 :nums.length;
    }
}