class Solution {
    public int maxScore(int[] cardPoints, int k) {
        // get the array sum
        int arraySum = 0;
        for(int i = 0;i < cardPoints.length;i++){
            arraySum += cardPoints[i];
        }
        // when k == cardPoints.length
        if(k == cardPoints.length){
            return arraySum;
        }
        // get the minimum sum subarray of length ()
        int minSum = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0, right = 0;
        int length = cardPoints.length - k - 1;
        
        // get the sum of first (cardPoints.length - k - 1) elements
        for(right = 0;right < length;right++){
            sum += cardPoints[right];
        }
        
        // get the min sub array sum of length (cardPoints.length - k)
        while(right < cardPoints.length){
            sum += cardPoints[right];
            
            minSum = Math.min(minSum, sum);
            sum -= cardPoints[left++];
            
            right++;
        }
        
        
        return arraySum - minSum;
    }
}