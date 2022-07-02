// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String A = read.readLine();
            String B = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.minRepeats(A,B));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int minRepeats(String a, String b) {
        // code here
        int ans=1;
        int repeat=b.length()/a.length() +2;
        String newStrA=a;
        for(int i=0;i<repeat;i++){
            if(newStrA.contains(b))
            return ans;
            //else repeat string a
            newStrA+=a;
            ans++;
        }
        return -1;
    }
};