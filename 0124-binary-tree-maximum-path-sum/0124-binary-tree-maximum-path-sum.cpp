/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int ans = INT_MIN;
    int solve(TreeNode* root){
        if(root == NULL){
            return 0;
        }
        int left = solve(root->left);
        int right = solve(root->right);
        ans = max(max(ans,max(root->val+left+right,root->val+max(left,right))),root->val);
        cout<<ans<<" ";
        return max(root->val,root->val+max(left,right));
        
    }
    int maxPathSum(TreeNode* root) {
        return max(ans,solve(root));
    }
};