class Solution {
    public String countAndSay(int n) {
//         At the beginning, I got confusions about what is the nth sequence. Well, my solution is accepted now, so I'm going to give some examples of nth sequence here. The following are sequence from n=1 to n=10:

//  1.     1
//  2.     11
//  3.     21
//  4.     1211
//  5.     111221 
//  6.     312211
//  7.     13112221
//  8.     1113213211
//  9.     31131211131221
//  10.   13211311123113112211
// From the examples you can see, the (i+1)th sequence is the "count and say" of the ith sequence!
    if(n <= 0) return "-1";
        String result = "1";
        
        for(int i = 1; i < n; i ++) {
            result = build(result);
        }
        return result;
    }
    
    private String build(String result) {
        StringBuilder builder = new StringBuilder();
        int p = 0;
        while(p < result.length()) {
            char val = result.charAt(p);
            int count = 0;
            
            while(p < result.length() && 
              result.charAt(p) == val){
                p ++;
                count ++;
            }
            builder.append(String.valueOf(count));
            builder.append(val);
        }
        return builder.toString();
    }
}