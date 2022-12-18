class Solution {
public:
    vector<int> dailyTemperatures(vector<int>& temperatures) {
        stack<int> stack;
        vector<int> result(temperatures.size());
      
        // To solve this problem, you can use a stack to keep track of the temperatures that have not yet been processed. For each temperature, you can pop all the temperatures from the stack that are smaller than the current temperature, and for each of those temperatures, you can set the result as the number of days you have to wait to get a warmer temperature.

    for (int i = temperatures.size() - 1; i >= 0; i--)
    {
        while (!stack.empty() && temperatures[stack.top()] <= temperatures[i])
        {
            stack.pop();
        }
        result[i] = stack.empty() ? 0 : stack.top() - i;
        stack.push(i);
    }

    return result;
    }
};