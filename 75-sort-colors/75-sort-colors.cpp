class Solution {
public:
    void sortColors(vector<int>& arr) {
        
        int i=0,j=arr.size()-1,curr=0;
        while(curr<=j){
            switch(arr[curr]){
                case 0: swap(arr[i],arr[curr]);
                        i++;
                        curr++;
                        break;
                case 1: curr++;
                        break;
                case 2: swap(arr[j],arr[curr]);
                        j--;
                        
                    
            }
        }
        // return arr;
    }
};