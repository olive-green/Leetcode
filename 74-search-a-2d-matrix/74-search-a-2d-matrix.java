class Solution {
    public boolean searchMatrix(int[][] arr, int x) {
//         binary search O(nlogn) solution
        int m=arr.length;
        int n=arr[0].length;
        // for(int row=0;row<m;row++){
        //       int i=0,j=n-1;
        //       while(i<=j){
        //           int mid=i+(j-i)/2;
        //           if(arr[row][mid]==x){
        //               // System.out.println(row);
        //               //   System.out.println(mid);
        //                 return true;
        //           }
        //           else if(arr[row][mid]<x){
        //               i=mid+1;
        //           }
        //           else
        //             j=mid-1;
        //       }
        //   }
        // return false;
        
        //2nd solution using sorting property of matrix
        // as we can see if stand at arr[0][n-1] or arr[m-1][0] we have two options to go 
        // either towards one no greater or no smaller but in arr[0][0] or arr[m-1][n-1] we dont have this option so we choose either of them as our starting point
        int i=0,j=n-1;
        while(i<m&& j>=0){
            if(arr[i][j]==x)
                return true;
            else if(arr[i][j]<x)
                i++;
            else
                j--;
        }
        return false;
        
        // T.C- O(n)
    }
}