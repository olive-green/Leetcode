class Solution {
    public int myAtoi(String s) {
        if(s.length()==0)
            return 0;
        char sign='+';
        long ans=0;
        //handles leading whitespace
        int i=0;
        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }
        //if we have string consists only whitespaces
        if(i>=s.length()) return 0;
        if(s.charAt(i)=='-' || s.charAt(i)=='+'){
                sign=s.charAt(i);
                i++;
        }
        for(;i<s.length();i++){
            //handles any non-digit char
            if(s.charAt(i)>'9' || s.charAt(i)<'0') break;
            
            int digit=s.charAt(i)-'0';
            ans=ans*10+digit;
            //handles out of range
            if(sign=='-' && (-1)*ans<Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            if(sign=='+' && ans>Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
        }
        if(sign=='-'){
            return (int)-ans;
        }
        return (int)ans;
    }
}
