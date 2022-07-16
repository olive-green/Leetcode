class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //here we have to use hashmap to store index as well
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int j=0;j<nums.length;j++){
            if(mp.containsKey(nums[j])){
                int i=mp.get(nums[j]);
                if(Math.abs(i-j)<=k)
                    return true;
            }
            mp.put(nums[j],j);
        }
        return false;
    }
}