class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())
            return false;
//         We can easily see whether it is rotated if B can be found in (A + A).
//         For example, with A = "abcde", B = "cdeab", we have

//         “abcdeabcde” (A + A)
//           “cdeab” (B)

        
        return (s+s).contains(goal);
    }
}