class Solution {
    public List<String> commonChars(String[] words) {
        int[] count=new int[26];
        Arrays.fill(count,Integer.MAX_VALUE);
        for(String str: words){
            int cnt[]=new int[26];
            str.chars().forEach(c-> cnt[c-'a']++);//count each char's frequency 
            //update minmum freq
            for(int i=0;i<26;i++){
                count[i]=Math.min(count[i],cnt[i]);
            }
        }
        List<String>ans=new ArrayList<>();
        for(char c='a';c<='z';c++){
            while(count[c-'a']-->0){
                ans.add(""+c);
            }
        } 
        return ans;
    }
}