class Solution {
    public long[] sumOfThree(long num) {
        if(num%3==0){
            long first=num/3;
            long second=first+1;
            long third=first+2;
            long tempThird=first-1;
            if(first+second+third==num)
                return new long[] {first,second,third};
            else
                return new long[] {tempThird,first,second};
        }
        else 
           return new long[] {};
    }
}