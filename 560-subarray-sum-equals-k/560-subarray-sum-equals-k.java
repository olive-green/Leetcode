class Solution {
    public int subarraySum(int[] nums, int k) {
//         HashMap<Integer,Integer> mp=new HashMap<>();
        
        
//         int sum=0;
//         int count=0;
//         for(int i=0;i<nums.length;i++){
//             sum+=nums[i];
//             if(sum==k)
//                 count++;
//             if(mp.containsKey(sum-k))
//                 count+=mp.get(sum-k);
//             mp.put(sum,mp.getOrDefault(sum, 0)+1);
//         }
//         return count;
           
       int count=0;
       for(int i=0;i<nums.length;i++){
           int sum=0;
           for(int j=i;j<nums.length;j++){
               sum+=nums[j];
               if(sum==k)
                   count++;
           }
       }
       return count;        
        
    }
}