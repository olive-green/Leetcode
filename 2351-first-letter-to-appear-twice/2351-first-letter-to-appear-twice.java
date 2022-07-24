class Solution {
    public char repeatedCharacter(String s) {
        // HashSet<Character> freq=new HashSet<>();
        boolean visited[]=new boolean[26];
        for(int i=0;i<s.length();i++){
            // if(freq.contains(s.charAt(i)))
            //     return s.charAt(i);
            // freq.add(s.charAt(i));
            if(visited[s.charAt(i) - 'a']==true){
                return s.charAt(i);
            }
            visited[s.charAt(i) - 'a']=true;
        }
        return s.charAt(s.length()-1);
    }
}