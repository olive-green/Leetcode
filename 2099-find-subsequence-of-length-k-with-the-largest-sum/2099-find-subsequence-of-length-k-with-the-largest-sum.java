class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        //here we use a priroity queue and starts add element while maintaining its size=k
        PriorityQueue<Pair<Integer,Integer>> pq=new PriorityQueue<>((a,b)-> (a.getKey()-b.getKey()));
        for(int i=0;i<nums.length;i++){
            pq.add(new Pair(nums[i],i));
            while(pq.size()>k)
                pq.poll();
        }
        System.out.println(pq);
        //store index on hashset
        HashSet<Integer> idx=new HashSet<>();
        while(pq.size()>0){
            idx.add(pq.peek().getValue());
            pq.poll();
        }
        int[] ans=new int[k];
        int p=0;
        for(int i=0;i<nums.length;i++){
            if(idx.contains(i))
                ans[p++]=nums[i];
        }
        return ans;
    }
}