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
        
        
        // 2.logarthmic recursive solution
        if(n==0) return 1;
        if(n==1) return x;
        
        double res=myPow(x*x,Math.abs(n/2));
        if(n%2!=0)
            res=res*x;
        if(n<0)
            return 1/res;
        return res;
            
        // OR
        //Logarthmic iterative solution
//         double ans=1;
//         long tempn=n;
//         if(n<0) tempn=-(tempn);
//         while(tempn>0){
//            if(tempn%2==0){
//               x=x*x;
//               tempn=tempn/2; 
//            }
//             else{
//                 ans=ans*x;
//                 tempn=tempn-1;
//             }
//         }
//         if(n<0)
//             return  1/ans;
//         return ans;
        
// //         OR
        //logarthmic bitwise solution
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