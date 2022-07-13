class Solution {
    public void combinations(int cb,int n,int ssf,int ts,List<List<Integer>> ans,List<Integer> comb){
        if(cb>n){
            if(ssf==ts){
                ans.add(new ArrayList<>(comb));
            }
            return;
        }
        
        //include a element
        comb.add(cb);
        combinations(cb+1,n,ssf+1,ts,ans,comb);
        
        //exclude a element
        comb.remove(comb.size()-1);
        combinations(cb+1,n,ssf,ts,ans,comb);
        
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>ans= new ArrayList<List<Integer>>();
        List<Integer> comb= new ArrayList<Integer>();
        combinations(1,n,0,k,ans,comb);
        return ans;
    }
}