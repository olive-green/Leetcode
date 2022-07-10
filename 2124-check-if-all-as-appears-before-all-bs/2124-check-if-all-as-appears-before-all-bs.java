class Solution {
    public boolean checkString(String s) {
        //check if b appears before a
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='b' && s.charAt(i+1)=='a')
                return false;
        }
        return true;
    }
}