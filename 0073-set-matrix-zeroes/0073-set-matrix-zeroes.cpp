class Solution {
public:
    void setZeroes(vector<vector<int>>& arr) {
       
        vector<vector<int>> mx(arr);
         int n=arr.size();
        int m=arr[0].size();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mx[i][j]==0){
                    //make rows zero
                    int k=0;
                    while(k<n){
                        arr[k++][j]=0;
                    }
                    k=0;
                    //make column zero
                    while(k<m){
                        arr[i][k++]=0;
                    }
                }
            }
        }
    }
};