class Solution {
    public boolean containsDuplicate(int[] nums) {
        //we can do it by using xor do check it soulution
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i]))
                return true;
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            // if(mp.get(nums[i]) >1)
            //     return true;
            
        }
      
        return false;
    }
}