class Solution {
    public String breakPalindrome(String palindrome) {
       char[] ch=palindrome.toCharArray();
        if(ch.length<2){
            return "";
        }
        for(int i=0;i<ch.length/2;i++){
            if(ch[i]!='a'){
                ch[i]='a';
                return String.valueOf(ch);
            }
        }
//         if we crossed the middle print all one
        ch[ch.length-1]='b';
        return String.valueOf(ch);
    }
}