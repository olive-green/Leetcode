class Solution {
    public int mySqrt(int x) {
        //linear time or logarthmic time
        // if(x==0)
        //     return 0;
        // if(x<4)
        //     return 1;
        // double ans=0;
        // for(double i=2;i<=x/2;i++){
        //     if(i*i==x)
        //         return (int)i;
        //     if(i*i>x)
        //         break;
        //     ans=i;
        // }
        // return (int)ans;
        
        //logarthmic solution
        //binary search we find m*m==x
        long s=0,e=Integer.MAX_VALUE;
        int ans=0;
        while(s<=e){
            long mid=s+(e-s)/2;
            
            
            if(mid*mid<=x){
                ans=(int)mid;
                 s=mid+1;
            }
               
            else
                e=mid-1;
            
        }
        return ans;
    }
}