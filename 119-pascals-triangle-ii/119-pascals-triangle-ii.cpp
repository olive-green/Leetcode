class Solution {
public:
    vector<int> getRow(int r) {
        vector<int> temp;
        
        for(int i=0;i<=r;i++){
            vector<int> row;
            for(int j=0;j<=i;j++){
                if(j==0 || j==i)
                    row.push_back(1);
                else
                    row.push_back(temp[j]+temp[j-1]);
            }
            temp=row;
            
        }
        return temp;
    }
};