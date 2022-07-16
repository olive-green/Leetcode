class Solution {
    public boolean containsDuplicate(int[] nums) {
        //we can do it by using xor do check it soulution
        // HashMap<Integer,Integer> mp=new HashMap<>();
        // use hashset to reduce time
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i]))
                return true;
            set.add(nums[i]);
            // mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            // if(mp.get(nums[i]) >1)
            //     return true;
            
        }
      
        return false;
    }
}