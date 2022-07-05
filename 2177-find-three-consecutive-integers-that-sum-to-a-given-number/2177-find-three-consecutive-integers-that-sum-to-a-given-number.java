class Solution {
    public long[] sumOfThree(long num) {
        if(num%3==0){
            long middle=num/3;
            long third=middle+1;
            long first=middle-1;
            
            // if(first+second+third==num)
                return new long[] {first,middle,third};
        }
        else 
           return new long[] {};
    }
}