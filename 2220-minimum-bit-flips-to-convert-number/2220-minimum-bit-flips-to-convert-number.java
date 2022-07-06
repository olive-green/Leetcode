class Solution {
    public int minBitFlips(int a, int b) {
        int ans=0;
        int xor=a^b;
        while(xor>0){
            int rsb=xor & (-xor);
            if(rsb!=0){
                ans++;
            }
            xor=xor^rsb;
        }
        return ans;
    }
}