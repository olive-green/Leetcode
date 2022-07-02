class Solution {
    public boolean isBsubstring(String a,String b){
        int n=a.length();
        int m=b.length();
        
        for(int i=0;i<=n-m;i++){
            int j;
            for(j=0;j<m;j++){
                if(a.charAt(i+j)!=b.charAt(j)){
                    break;
                }
            }
            if(j==m)
                return true;
        }
        return false;
    }
    public int repeatedStringMatch(String a, String b) {
        // String as = a;
        // for (int rep = 1; rep <= b.length() / a.length() + 2; rep++, as += a)
        //     if (as.indexOf(b) != -1) return rep;
        // return -1;
        
        String temp=a;
        
        int ans=1;
        while(a.length()<b.length()){
            a+=temp;
            ans++;
        }
        if(isBsubstring(a,b))
            return ans;
        
        if(isBsubstring(a+temp,b)) return ans+1;
        
        return -1;
    }
}