class Solution {
    public int firstUniqChar(String s) {
        // Queue<Pair<Character,Integer>> q=new PriorityQueue<>();
        
        HashMap<Character,Pair<Integer,Integer>> st=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(st.containsKey(s.charAt(i))){
                st.put(ch,new Pair<Integer,Integer>(i,st.get(ch).getValue()+1));
            }
            else
            st.put(ch,new Pair(i,1));
        }
        int min=Integer.MAX_VALUE;
        for(Map.Entry<Character,Pair<Integer,Integer>> ele: st.entrySet()){
            if(ele.getValue().getValue()==1){
                min=Math.min(min,ele.getValue().getKey());
            }
        }
        System.out.println(st);
        if (min>s.length())
            return -1;
        return min;
    }
}