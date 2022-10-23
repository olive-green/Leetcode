class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
//         we gonna make a hashmap inside hashmap and checks if string is matches with all freq then insert it into a list 
        Map<Map<Character, Integer>,List<String>> mp=new HashMap<>();
        for(String s:strs){
            HashMap<Character,Integer> map=new HashMap<>();
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
            if(mp.containsKey(map)){
                
                mp.get(map).add(s);
            }
            else{
                List<String> ans=new ArrayList<>();
                ans.add(s);
                mp.put(map,ans);
            }
        }
        //now traverse the map and make a outtput
        List<List<String>> res=new ArrayList<>();
        for(List<String> s: mp.values()){
            res.add(s);
        }
        return res;
    }
}