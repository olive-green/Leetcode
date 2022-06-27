class Solution {
    public int minPartitions(String n) {
        //logic
        //this question is equivalent to find max digit in a number
        //cuz ans is max digit ie. that no. of times we have to subtract 11111 or 101011.. or anything from number to get zero
        //we find this by analyzing the pattern , we subtract it each times with equivalent all 1's no and if there is any digit with zero in number then at that place we also include 1
        //ex- 82734-11111=71623, 71623-11111=60512,60512-10111=50401
        
        
//         int i=1,j=n.length()-1;
//         int ans=Character.getNumericValue(n.charAt(0));
//         while(i<=j){
            
//             if(Character.getNumericValue(n.charAt(i))>ans){
//                 ans=Character.getNumericValue(n.charAt(i));
//             }
//             if(Character.getNumericValue(n.charAt(j))>ans){
//                 ans=Character.getNumericValue(n.charAt(j));
//             }
//             i++;j--;
//         }
//         return ans;
        
        // another sol
         int res = 0;
        for (int i = 0; i < n.length(); ++i)
            res = Math.max(res, n.charAt(i) - '0');
        return res;
        
    }
}