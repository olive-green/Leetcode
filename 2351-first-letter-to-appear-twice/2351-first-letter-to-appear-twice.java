class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> freq=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(freq.contains(s.charAt(i)))
                return s.charAt(i);
            freq.add(s.charAt(i));
        }
        return s.charAt(s.length()-1);
    }
}