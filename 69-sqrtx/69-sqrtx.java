class Solution {
    public int mySqrt(int x) {
        //linear time
        if(x==0)
            return 0;
        if(x<4)
            return 1;
        double ans=0;
        for(double i=2;i<=x/2;i++){
            if(i*i==x)
                return (int)i;
            if(i*i>x)
                break;
            ans=i;
        }
        return (int)ans;
    }
}