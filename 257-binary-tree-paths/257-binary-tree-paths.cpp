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
    bool helper(TreeNode* root,vector<string> &ans,string temp){
        if(root==NULL)
            return false;
        //making ans
        if(root->left==NULL && root->right==NULL)
        {
            temp+=to_string(root->val);
            ans.push_back(temp);
            temp="";
            return true;
        }
        temp+=to_string(root->val)+"->";
        
        bool left=helper(root->left,ans,temp);
        bool right=helper(root->right,ans,temp);
        if(left==true || right==true)
            return true;
        //remove the last added element
        // temp.erase(temp.begin()+temp.size());
        return false;
    }
    vector<string> binaryTreePaths(TreeNode* root) {
        vector<string> ans;
        
        helper(root,ans,"");
        return ans;
    }
};