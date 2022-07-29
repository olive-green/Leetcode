class Solution {
    public String longestCommonPrefix(String[] strs) {
        // return new String("fl");
        // String ans=strs[0];
        // for(int i=1;i<strs.length;i++){
        //     String temp="";
        //     for(int j=0;j<strs[i].length();j++){
        //         if(ans.size())
        //         if(ans.charAt(j)==strs[i].charAt(j)){
        //             temp+=ans.charAt(j);
        //         }
        //     }
        //     ans=temp;
        // }
        // return ans;
        
        if (strs == null || strs.length == 0)
            return "";
        
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int c = 0;
        while(c < first.length())
        {
            if (first.charAt(c) == last.charAt(c))
                c++;
            else
                break;
        }
        return c == 0 ? "" : first.substring(0, c);
    }
}