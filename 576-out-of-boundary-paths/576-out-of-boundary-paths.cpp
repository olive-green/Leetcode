class Solution {
    private:

    int mod;
    int memo[51][51][51];
public:
    Solution(){}
    int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        memset(memo,-1,sizeof(memo));
        
        mod=10e8+7;
        return fun(m,n,startRow,startColumn,maxMove)%mod;
    }
    long long int fun(int m,int n,int r,int c,int step)
    {   if(r==m || r<0 || c<0 || c==n)
        return 1;
        if(step==0)
            return 0;
    long long int x,y,z,w;

     
     if(memo[r][c][step]!=-1)
         return memo[r][c][step];
    
     //up
         x=fun(m,n,r-1,c,step-1)%mod;
   
     //bottom
         y=fun(m,n,r+1,c,step-1)%mod;
       //right
        z=fun(m,n,r,c+1,step-1)%mod;
     //left
       w=fun(m,n,r,c-1,step-1)%mod;
     return memo[r][c][step]=(x+y+z+w)%mod;
    }
};