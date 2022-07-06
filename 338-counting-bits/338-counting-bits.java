class Solution {
    public int[] countBits(int n) {
        int[] ans=new int[n+1];
        int k=0;
        for(int j=0;j<=n;j++){
            int count=0;
            int i=j;
            while(i>0){
                int rsb=i &(-i);
                if(rsb!=0)
                    count++;
                i=i^rsb;
            }
            ans[k++]=count;
            
        }
        return ans;
    }
}