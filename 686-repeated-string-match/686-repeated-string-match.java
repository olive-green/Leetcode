class Solution {
//     public boolean isBsubstring(String a,String b){
//         int n=a.length();
//         int m=b.length();
        
//         for(int i=0;i<=n-m;i++){
//             int j;
//             for(j=0;j<m;j++){
//                 if(a.charAt(i+j)!=b.charAt(j)){
//                     break;
//                 }
//             }
//             if(j==m)
//                 return true;
//         }
//         return false;
//     }
    public int repeatedStringMatch(String a, String b) {
        String newStrA = a;
        int count=1;
        //now we have to find how many max no. of time a have to repeat to get substring of b
        int repeat=b.length()/a.length() +2; //2 is added because one time for first character and one time for last character like in case z xyzxyzxyz
        for(int i=0;i<repeat;i++){
            if(newStrA.contains(b))
                return count;
            //else repeat a
            newStrA+=a;
            count++;
        }
        return -1;
    
        
        
        
//         String temp=a;
        
//         int ans=1;
//         while(a.length()<b.length()){
//             a+=temp;
//             ans++;
//         }
//         if(isBsubstring(a,b))
//             return ans;
        
//         if(isBsubstring(a+temp,b)) return ans+1;
        
//         return -1;
    }
}