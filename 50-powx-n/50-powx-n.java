class Solution {
    public double myPow(double x, int n) {
        // 1.Linear
        // if(x==1 || x==0)
        //     return x;
        // int tempn=n;
        // if(n<0)
        //  tempn=-1*tempn;
        // double ans=1;
        // for(double i=1;i<=tempn;i++){
        //     ans=ans*x;
        // }
        // if(n<0)
        //     return 1/ans;
        // return ans;
        //above failed for large no of n
        // like 1.00 n=2^31
        
        
        // 2.logarthmic solution
//         if(n==0) return 1;
//         if(n==1) return x;
//         double xpbn2;
//         if(n<0){
//              xpbn2=myPow(1/x,-n/2);
//              if(-n%2==0)
//                  return xpbn2*xpbn2;
//             else 
//                 return xpbn2*xpbn2*(1/x);
//         }
        
//         xpbn2=myPow(x,n/2);
//         if(n%2==0)
//             return xpbn2*xpbn2;
//         return xpbn2*xpbn2*x;
            
        double ans=1;
        long tempn=n;
        if(n<0) tempn=-(tempn);
        while(tempn>0){
           if(tempn%2==0){
              x=x*x;
              tempn=tempn/2; 
           }
            else{
                ans=ans*x;
                tempn=tempn-1;
            }
        }
        if(n<0)
            return  1/ans;
        return ans;
        
        
        
//         if(n < 0){
//             n = -n;
//             x = 1 / x;
//         }
        
//         double pow = 1;
        
//         while(n != 0){
//             if((n & 1) != 0){
//                 pow *= x;
//             } 
                
//             x *= x;
//             n >>>= 1;
            
//         }
        
//         return pow;
        
        
    }
}