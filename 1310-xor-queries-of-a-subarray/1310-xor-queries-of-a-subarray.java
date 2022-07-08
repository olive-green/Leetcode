class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] prefixXor=new int[arr.length];
        prefixXor[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefixXor[i]=prefixXor[i-1]^arr[i];
        }
        int ans[]=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int left=queries[i][0];
            int right=queries[i][1];
            if(left==0)
                ans[i]=prefixXor[right];
            else
            ans[i]=prefixXor[right] ^ prefixXor[left-1];
        }
        return ans;
    }
}