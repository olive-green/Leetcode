class Solution {
public:
    // When we encounter a '' we will make a move, irrespective of the fact that there might be 'O'. After the move we will move the pointer by 3 steps since we are gauranteed that there won't be any more 'X' till the position we have swapped.

    int minimumMoves(string s) {
        int i = 0, n = s.length(), count = 0;
        while (i < n) {
            if (s[i] == 'O')  // If we find 'O' we simply move the pointer one step
                i++;
            else
                count++, i += 3;  // When we find 'X' we increment the count and move the pointer by 3 steps
        }
        return count;
    }
};