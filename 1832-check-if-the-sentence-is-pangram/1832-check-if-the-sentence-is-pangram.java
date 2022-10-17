class Solution {
    public boolean checkIfPangram(String s) {
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
         // System.out.println(Arrays.toString(freq));
        // ;
        for(int i=0;i<26;i++){
            if(freq[i]==0){
                return false;
            }
        }
       
        return true;
    }
}