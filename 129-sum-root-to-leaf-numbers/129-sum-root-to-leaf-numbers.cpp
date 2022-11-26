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
    bool helper(TreeNode* root, string temp,int & ans){
        if(root==NULL)
            return false;
        temp+=to_string(root->val);
        if(root->left==NULL && root->right==NULL){
            ans+=stoi(temp);
            return true;
        }
        bool left=helper(root->left,temp,ans);
        bool right=helper(root->right,temp,ans);
        
        if( left==true || right==true ){
            return true;
        }
        return false;
    }
    int sumNumbers(TreeNode* root) {
        if(root==NULL)
            return 0;
        int ans=0;
        helper(root,"",ans);
        return ans;
    }
};