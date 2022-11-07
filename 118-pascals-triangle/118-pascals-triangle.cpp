#define pb push_back
class Solution {
public:
    vector<vector<int>> generate(int n) {
        vector<vector<int>> ans(n);
        
//         vector<int> temp;
        
//         for(int i=0;i<n;i++){
//             vector<int> row;
//             for(int j=0;j<=i;j++){
//                 if(j==0 || j==i)
//                     row.pb(1);
//                 else
//                     row.pb(temp[j-1]+temp[j]);
//             }
//             temp=row;
//             ans.pb(row);
//         }
//         return ans;
        
        //we added 1 at first and last pos everytime
        //try to modify the middle cells
        // Create an array of size (i + 1) (For some languages such as C++, you need to create a 2D array at the start of the program and resize array[i] to (i + 1)).
    // Set the first and last value of array[i] to 1.
    // Run another loop from j = 1 to i – 1 (inclusive) and for each iteration put array[i][j] = array[i – 1][j – 1] + array[i – 1][j].
        
        for(int i=0;i<n;i++){
            ans[i].resize(i+1);
            ans[i][0]=ans[i][i]=1;
            for(int j=1;j<i;j++){
                ans[i][j]=ans[i-1][j-1]+ans[i-1][j];
            }
        }
        return ans;
        
    }
};