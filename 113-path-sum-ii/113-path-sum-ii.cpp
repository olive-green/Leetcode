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
    bool helper(TreeNode* root,int t,vector<vector<int>>&ans,vector<int> temp,int sum){
        if(root==NULL)
            return false;
        sum+=root->val;
        temp.push_back(root->val);
        if(root->left==NULL && root->right==NULL && sum==t)
        {
            
            ans.push_back(temp);
            return true;
        }
        
       
        
        bool left=helper(root->left,t,ans,temp,sum);
        bool right=helper(root->right,t,ans,temp,sum);
        if(left==true || right==true)
            return true;
        return false;
    }
    vector<vector<int>> pathSum(TreeNode* root, int t) {
        vector<vector<int>> ans;
        if(root==NULL)
            return ans;
        vector<int> temp;
        helper(root,t,ans,temp,0);
        return ans;
    }
};