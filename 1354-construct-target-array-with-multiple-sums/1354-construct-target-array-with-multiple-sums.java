//logic
// 1.find the total sum
// 2. find the indx of max value
// 3. find the diff= total-maxvalue
// 4. update the maxvalue=maxvalue-diff
// 5. repeat till all values equal to 1
class Solution {
    public boolean isPossible(int[] target) {
        long sum=0;
        int maxidx=0;
        for(int i=0;i<target.length;i++){
            sum+=target[i];
            if(target[maxidx]<target[i])
                maxidx=i;
        }
        
        //solution
        long diff=sum-target[maxidx];
        
        if(target[maxidx]==1 || diff==1) return true;
        if(diff>target[maxidx] || diff==0 || target[maxidx]%diff==0) return false;
        
        target[maxidx]%=diff;
        
        return isPossible(target);
    }
}