class Solution {
    public int[] frequencySort(int[] nums) {
//         HashMap<Integer,Integer> freq=new HashMap<>();
//         int n=nums.length;
//         for(int i=0;i<n;i++){
//             freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
//         }
        
//         List<Integer> numbers= new ArrayList(freq.keySet());
//         //sort the list according to freq
//         Collections.sort(numbers, (a,b)->{
//             if(freq.get(a)<freq.get(b))
//                 return true;
//             else if(freq.get(a)==freq.get(b)){
//                 if(freq.getKey(a)>freq.getKey(b))
//                     return true;
//                 return false;
//             }
//             return false;
//         });
        
//         ArrayList<Integer> ans=new ArrayList<>();
//         for(int n: numbers){
//             for(int i=1;i<=freq.get(n);i++){
//                 ans.add(n);
//             }
//         }
//         return ans;
        
        
        int[] result = new int[nums.length];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i : nums) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(hm.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>(){
           public int compare(Map.Entry<Integer,Integer> e1, Map.Entry<Integer,Integer> e2) {
               if (e1.getValue() == e2.getValue())
                   return e2.getKey() - e1.getKey();
               else 
                   return e1.getValue() - e2.getValue();
           } 
        });
        
        int i = 0;
        for (Map.Entry<Integer, Integer> k : list) {
            int val = k.getValue();
            while(val > 0) {
                result[i] = k.getKey();
                i++;
                val--;
            }
        }
        return result;
        
    }
}