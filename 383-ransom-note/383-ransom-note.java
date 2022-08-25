class Solution {
    public boolean canConstruct(String r, String m) {
        boolean ans=true;
        int[] freq=new int[26];
        for(int i=0;i<m.length();i++){
            freq[m.charAt(i) - 'a']++;
        }
        for(int i=0;i<r.length();i++){
            freq[r.charAt(i)-'a']--;
            if(freq[r.charAt(i)-'a']<0)
                return false;
            
        }
        // System.out.println(freq);
        return ans;
    }
}