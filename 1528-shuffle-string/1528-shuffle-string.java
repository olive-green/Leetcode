class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            int pos=indices[i];
            
            sb.setCharAt(pos,s.charAt(i));
           
        }
        return sb.toString();
    }
}