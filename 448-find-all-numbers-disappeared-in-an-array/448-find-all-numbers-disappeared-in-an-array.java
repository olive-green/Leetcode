class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // HashSet<Integer> set=new HashSet<>();
        // List<Integer> ans=new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //     set.add(nums[i]);
        // }
        // for(int i=1;i<=nums.length;i++){
        //     if(!set.contains(i)){
        //         ans.add(i);
        //     }
        // }
        // return ans;
        
        
        // 2.Instead of using hashset we can use boolean array
        
        boolean[] check=new boolean[nums.length+1];
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            // set.add(nums[i]);
            check[nums[i]]=true;
        }
        for(int i=1;i<=nums.length;i++){
            if(!check[i]){
                ans.add(i);
            }
        }
        return ans;
    }
}