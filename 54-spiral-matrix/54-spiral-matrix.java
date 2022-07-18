class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        int rowBegin=0,rowEnd=n-1,colBegin=0,colEnd=m-1;
        while(rowBegin<=rowEnd && colBegin<=colEnd){
            //right
            for(int j=colBegin;j<=colEnd;j++){
                ans.add(matrix[rowBegin][j]);
            }
            rowBegin++;
            //Down
            for(int i=rowBegin;i<=rowEnd;i++){
                ans.add(matrix[i][colEnd]);
            }
            colEnd--;
            if(rowBegin<=rowEnd){
                //left
                for(int j=colEnd;j>=colBegin;j--){
                    ans.add(matrix[rowEnd][j]);
                }
            }
            rowEnd--;
            
            if(colBegin<=colEnd){
                //up
                for(int i=rowEnd;i>=rowBegin;i--){
                    ans.add(matrix[i][colBegin]);
                }
            }
            colBegin++;
            
        }
        return ans;
    }
}