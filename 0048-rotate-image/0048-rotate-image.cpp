class Solution {
public:
    void rotate(vector<vector<int>>& matrix) {
        //we can observe that output matrix is transpose of a given matrix with each row reveresed of a transpose matrix.
        // 1. find transpose of matrix
        // 2. reverse each row of transpose matrix
        for(int i=0;i<matrix.size();i++){
            for(int j=i+1;j<matrix[0].size();j++){
                swap(matrix[i][j],matrix[j][i]);
            }
        }
        //now reverse each row
        for(int i=0;i<matrix.size();i++){
            reverse(matrix[i].begin(),matrix[i].end());
        }
        
    }
};