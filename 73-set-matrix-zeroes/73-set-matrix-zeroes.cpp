class Solution {
public:
    void setZeroes(vector<vector<int>>& mx) {
        int m=mx.size();
        int n=mx[0].size();
        vector<vector<int>> copy(mx);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(copy[i][j]==0){
                    //row
                    int k=0;
                    while(k<n){
                        mx[i][k++]=0;
                    }
                    //column
                    k=0;
                    while(k<m){
                        mx[k++][j]=0;
                    }
                }
            }
        }
    }
};