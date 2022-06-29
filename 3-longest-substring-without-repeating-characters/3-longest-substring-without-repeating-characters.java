class Solution {
    public int lengthOfLongestSubstring(String s) {
         if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int ans=0;
        int i=0,j=0;
        while(j<s.length()){
            char x=s.charAt(j);
            if(!map.containsKey(x)){
                map.put(x,1);
            }
            else{
                map.put(x,map.get(x)+1);
            }
            if(map.size()==j-i+1){
                ans=Math.max(ans,j-i+1);
                j++;
            }
            else { //map.size()<j-i+1
                while(map.size()<j-i+1){
                    char t=s.charAt(i);
                    if(map.containsKey(t)){
                        if(map.get(t)==1)
                            map.remove(t);
                        else{
                            map.put(t,map.get(t)-1);
                        }
                    }
                    i++;
                }
                j++;
            }
        }
        return ans;
        
    }
}