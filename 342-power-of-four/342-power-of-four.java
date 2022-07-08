class Solution {
    public boolean isPowerOfFour(int n) {
        //first is using log4 like log2
        return (Math.log(n)/Math.log(4))%1==0;
        
        
        //logic
        //all 4's power has even no of unset bits ex 4=2,16=4,64=6
        //to count the unset bits, we can first toggle the bits then count the no of set 
        //bits in a number
        //toggle bits
        // n=n^1;
        // //now apply kernighans algorithm
        // int count=0;
        // // while(n>0){
        // //     int rsbmask=n &(-n);
        // //     if(rsbmask!=0)
        // //         count++;
        // //     n=n^rsbmask;
        // // }
        // for(int )
        // if(count%2==0)
        //     return true;
        // return false;
    }
}