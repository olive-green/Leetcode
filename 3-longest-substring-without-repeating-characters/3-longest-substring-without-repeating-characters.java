class Solution {
    public int lengthOfLongestSubstring(String s) {
        //sliding window
        int i=0,j=0;
        HashMap<Character,Integer> mp=new HashMap<>();
        // for(int k=0;k<s.length();k++){
        //     mp.put(s.charAt(k),mp.getOrDefault(s.charAt(k),0)+1);
        // }
        int ans=0;
        while(j<s.length()){
             mp.put(s.charAt(j),mp.getOrDefault(s.charAt(j),0)+1);
            if(mp.size()>j-i+1){//this condition never hits so you can remove it
                j++;
            }
            if(mp.size()==(j-i+1)){
                //found valid ans
                ans=Math.max(ans,j-i+1);
                j++;
            }
            else if(mp.size()<j-i+1){
                
                while(mp.size()<j-i+1){
                    char ch=s.charAt(i);
                    mp.put(ch,mp.get(ch)-1);
                    if(mp.get(ch)==0)
                        mp.remove(ch);
                    i++;
                }
                j++;
            }
        }
        System.out.println(mp);
        return ans;
        
//          if (s.length()==0) return 0;
//         HashMap<Character, Integer> map = new HashMap<>();
//         int ans=0;
//         int i=0,j=0;
//         while(j<s.length()){
//             char x=s.charAt(j);
//             if(!map.containsKey(x)){
//                 map.put(x,1);
//             }
//             else{
//                 map.put(x,map.get(x)+1);
//             }
//             if(map.size()==j-i+1){
//                 ans=Math.max(ans,j-i+1);
//                 j++;
//             }
//             else { //map.size()<j-i+1
//                 while(map.size()<j-i+1){
//                     char t=s.charAt(i);
//                     if(map.containsKey(t)){
//                         if(map.get(t)==1)
//                             map.remove(t);
//                         else{
//                             map.put(t,map.get(t)-1);
//                         }
//                     }
//                     i++;
//                 }
//                 j++;
//             }
//         }
//         return ans;
        
    }
}