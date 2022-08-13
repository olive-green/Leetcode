class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> mp=new HashMap<>();
        List<List<String>> ans=new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            char[] ch=strs[i].toCharArray();
            Arrays.sort(ch);
            // mp.put(String.valueOf(ch),mp.getOrDefault(String.valueOf(ch),0)+1);
            // mp.put(ch.toString(),)
            if(!(mp.containsKey(String.valueOf(ch)))){
                mp.put(String.valueOf(ch),new ArrayList<String>());
            }
            mp.get(String.valueOf(ch)).add(strs[i]);
        }
        // List<String> temp=new ArrayList<>();
        for(Map.Entry<String ,List<String>> ele:mp.entrySet()){
            ans.add(ele.getValue());
        }
        
        return ans;
    }
}