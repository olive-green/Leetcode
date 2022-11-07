class Solution {
public:
    void setZeroes(vector<vector<int>>& mx) {
        int m=mx.size();
        int n=mx[0].size();
        // vector<vector<int>> copy(mx);
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         if(copy[i][j]==0){
        //             //row
        //             int k=0;
        //             while(k<n){
        //                 mx[i][k++]=0;
        //             }
        //             //column
        //             k=0;
        //             while(k<m){
        //                 mx[k++][j]=0;
        //             }
        //         }
        //     }
        // }
        // T.C- O(m*n*(m+n));//worst case when all elements are already zero
        //S.C- O(m*n)
        
                        // 2nd solution
        // Assuming all the elements in the matrix are non-negative. Traverse through the matrix and if you find an element with value 0, then change all the elements in its row and column to -1, except when an element is 0. The reason for not changing other elements to 0, but -1, is because that might affect other columns and rows. Now traverse through the matrix again and if an element is -1 change it to 0, which will be the answer.
        
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 if(mx[i][j]==0){
//                     //now go one row above
//                     int k=i-1;
//                     while(k>=0){
//                         if(mx[k][j]!=0)
//                             mx[k][j]=-1;
//                         k--;
//                     }
//                     //now set -1 to all rows down
//                     k=i+1;
//                     while(k<m){
//                         if(mx[k][j]!=0)
//                             mx[k][j]=-1;
//                         k++;
//                     }
//                     //now set -1 to all columns to left of current cell
//                     k=j-1;
//                     while(k>=0){
//                         if(mx[i][k]!=0)
//                             mx[i][k]=-1;
//                         k--;
//                     }
//                     //now set to right columns
//                     k=j+1;
//                     while(k<n){
//                         if(mx[i][k]!=0)
//                             mx[i][k]=-1;
//                         k++;
//                     }
//                 }
//             }
//         }
        
//         //now we set zero to original array where we find -1
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 if(mx[i][j]==-1)
//                     mx[i][j]=0;
//             }
//         }
        
        // T.C- O(n*m)*(n+m)
        // S.C- O(1)
        
                            // 3rd soln
//         Intuition: Instead of traversing through each row and column, we can use dummy arrays to check if the particular row or column has an element 0 or not, which will improve the time complexity.

// Approach:Take two dummy array one of size of row and other of size of column.Now traverse through the array.If matrix[i][j]==0 then set dummy1[i]=0(for row) and dummy2[j]=0(for column).Now traverse through the array again and if dummy1[i]==0  || dummy2[j]==0 then arr[i][j]=0,else continue.
        vector<int> row(m,-1);
        vector<int> col(n,-1);
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mx[i][j]==0)
                {
                    row[i]=0;
                    col[j]=0;
                }
            }
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(row[i]==0 || col[j]==0)
                    mx[i][j]=0;
            }
        }
                            
        
    }
};