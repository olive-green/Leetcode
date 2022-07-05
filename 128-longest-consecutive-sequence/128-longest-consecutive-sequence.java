class Solution {
    public int longestConsecutive(int[] nums) {
        // HashMap<Integer,Boolean> map= new HashMap<>();
//         HashSet<Integer> set=new HashSet<>();
//         for(int i=0;i<nums.length;i++){
//             set.add(nums[i]);
//         }
//         int count=0;
//         for(int i=0;i<nums.length;i++){
            
//                 int temp=1;
//                 int j=nums[i]+1;
//                 while(set.contains(j++)){
//                     temp++;
//                 }
//                  count=Math.max(count,temp);
            
//         }
//         return count;
        
        HashSet set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int max = 0;
        for(int i : nums){
            if(!set.contains(i-1)){
                int count = i;
                while(set.contains(count)){
                    count++;
                }
                max = Math.max(count - i, max);
            }
        }
        return max;
    }
}