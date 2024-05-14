class Solution {
    int maxGold=0;
    public void totalGold(int[][] grid,int i,int j,int sum){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]==0)
            return;
        int temp=grid[i][j];
        sum+=temp;
        maxGold=Math.max(sum,maxGold);
        grid[i][j]=0;
        //go left
           totalGold(grid,i,j-1,sum);
        //go right
           totalGold(grid,i,j+1,sum);
        
        //go top
            totalGold(grid,i+1,j,sum);
        
        //go bottom
        totalGold(grid,i-1,j,sum);
        
        //now backtrack
        grid[i][j]=temp;
        
    }
    public int getMaximumGold(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
      
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]!=0)
                    totalGold(grid,i,j,0);
            }
        }
        return maxGold;
    }
}