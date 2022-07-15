class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        //convert map into list
//         List<Map.Entry<Integer,Integer>> l=new ArrayList<>(mp.entrySet());
//         Collections.sort(l,(a,b)-> b.getValue()-a.getValue());
        
//         //put sorted list back into map
//         for(Map.Entry<Integer,Integer> temp:l){
//             mp.put(temp.getKey(),temp.getValue());
//         }
//         //now we traverse the map
//         //here we use priority queue and store 
//         int[] ans=new int[k];
//         int i=0;
//         for(Integer key: mp.keySet()){
//             if(k--==0) break;
//             ans[i++]=(key);
//         }
//         return ans;
        
        //store in priority queue
        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>((a,b)-> b.getValue()-a.getValue());
        
        for(Map.Entry<Integer,Integer> e: mp.entrySet()){
            pq.add(e);
        }
        int[] ans=new int[k];
        int i=0;
        while(k-->0){
            Map.Entry<Integer,Integer> entry=pq.poll();
            ans[i++]=entry.getKey();
        }
        return ans;
    }
}