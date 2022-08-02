class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int count=0,left=0;
        for(Map.Entry<Integer,Integer> mp : map.entrySet()){
            int val=mp.getValue();
            if(val>1){
                count+=val/2;
                map.put(mp.getKey(),val-(val/2*2));
            }
            if(map.get(mp.getKey())==1){
                left++;
            }
                
        }
        // System.out.println(map);
        return new int[]{count,left};
    }
}