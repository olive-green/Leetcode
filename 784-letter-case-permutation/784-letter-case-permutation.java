class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String>ans=new ArrayList<>();
        helper(ans,0,s.toCharArray());
        return ans;
    }
    public  void helper(List<String>ans,int i,char []s)
    {
        if(i==s.length)
            ans.add(new String(s));
        else
        {
            if(Character.isLetter(s[i]))
            {
                s[i]=Character.toUpperCase(s[i]);
                helper(ans,i+1,s);
                s[i]=Character.toLowerCase(s[i]);
                helper(ans,i+1,s);
            }
            else
                helper(ans,i+1,s);
        }
    }
}