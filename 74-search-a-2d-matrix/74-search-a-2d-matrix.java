class Solution {
    public boolean searchMatrix(int[][] arr, int x) {
        int m=arr.length;
        int n=arr[0].length;
        for(int row=0;row<m;row++){
              int i=0,j=n-1;
              while(i<=j){
                  int mid=i+(j-i)/2;
                  if(arr[row][mid]==x){
                      // System.out.println(row);
                      //   System.out.println(mid);
                        return true;
                  }
                  else if(arr[row][mid]<x){
                      i=mid+1;
                  }
                  else
                    j=mid-1;
              }
          }
        return false;
    }
}