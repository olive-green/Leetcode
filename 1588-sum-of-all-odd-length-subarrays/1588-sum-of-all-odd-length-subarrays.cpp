class Solution {
public:
    int sumOddLengthSubarrays(vector<int>& arr) {
         int n = arr.size(),sum = 0;
        for (int i = 0; i < n; i ++) {
            int endI = i + 1;
            int startI = n - i;
            int totalIncludeI = endI * startI;
            int odd = totalIncludeI / 2;
            if (totalIncludeI % 2 == 1) odd ++;
            sum += arr[i] * odd;
        }
        return sum;
    }
};