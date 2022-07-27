class Solution {
    public void Comb(int i,int k,int n,int newsum, List<List<Integer>> ans,List<Integer>li){
    
    if(k==0){
        if(newsum==n){
            ans.add(new ArrayList<>(li));
        }
        return;
    }
    if(i==10)return;
    if(newsum>n) return;
    
    
    li.add(i);
    Comb(i+1,k-1,n,newsum+i,ans,li);
    li.remove(li.size()-1);
    Comb(i+1,k,n,newsum,ans,li);
}
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        List<Integer> list=new ArrayList<>();
        Comb(1,k,n,0,ans,list);
        return ans;
    }
}