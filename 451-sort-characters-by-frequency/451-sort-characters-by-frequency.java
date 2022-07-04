class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> freq=new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            freq.put(s.charAt(i),freq.getOrDefault(s.charAt(i),0)+1);
        }
        
        //now making a list of char 
        List<Character> chars=new ArrayList(freq.keySet());
        //now sort the list according to their frequency
        Collections.sort(chars,(a,b)-> {
            return freq.get(b)-freq.get(a);
        });
        
        //now build a ans string
        StringBuilder sb= new StringBuilder();
        for(char c:chars){
            for(int i=1;i<=freq.get(c);i++){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}