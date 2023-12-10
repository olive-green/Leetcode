class Solution {
    public int[][] transpose(int[][] m) {
        int s=m[0].length;
        int [][] res=new int[s][m.length];
        for(int i=0;i<m[0].length;i++){
            for(int j=0;j<m.length;j++){
                // int temp=m[i][j];
                res[i][j]=m[j][i];
                // m[j][i]=temp;
            }
        }
        return res;
    }
}