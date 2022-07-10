class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())
            return false;
//         We can easily see whether it is rotated if B can be found in (A + A).
//         For example, with A = "abcde", B = "cdeab", we have

//         “abcdeabcde” (A + A)
//           “cdeab” (B)

        
        // return (s+s).contains(goal);
        
        
        
        //2nd solution
        if(s.length() == 0) {
            return true;
        }
        for(int i = 0; i < s.length(); i++) {
            if(rotateString(s, goal, i)) {
                return true;
            }
        }
        return false;
    }
     private boolean rotateString(String A, String B, int rotation) {
        for(int i = 0; i < A.length(); i++) {
            if(A.charAt(i) != B.charAt((i+rotation)%B.length())) {
                return false;
            }
        }
        return true;
    }
}