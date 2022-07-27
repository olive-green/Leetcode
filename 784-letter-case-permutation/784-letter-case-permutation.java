class Solution {
    public void pmt(int i,String s,List<String> ans,String asf){
        if(i==s.length()){
            ans.add(asf);
            return;
        }        
            if(!Character.isDigit(s.charAt(i))){
                //lowercase char added
                String left=s.substring(0,i);
                // System.out.println(left);
                String right=s.substring(i+1);
                s=left+Character.toLowerCase(s.charAt(i))+ right;
                pmt(i+1,s,ans,asf+s.charAt(i));
                //uppercase char added
                // now to make uppercase letter as we know we cannot make change in s so we have to make new string in which ith char is uppercase
                
                s=left+Character.toUpperCase(s.charAt(i))+right;
                pmt(i+1,s,ans,asf+s.charAt(i));
            }
            else
            {
                
                pmt(i+1,s,ans,asf+s.charAt(i));
            }
        
    }
    public List<String> letterCasePermutation(String s) {
        List<String> ans=new ArrayList<>();
        pmt(0,s,ans,"");
        return ans;
    }
}