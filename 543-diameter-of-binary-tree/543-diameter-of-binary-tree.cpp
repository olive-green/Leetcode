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
    int ht(TreeNode* root){
        if(root==NULL)
            return 0;
        
        return max(ht(root->left),ht(root->right))+1;
    }
    int diameterOfBinaryTree(TreeNode* root) {
        //find the longest path in left subtree and right subtree and join them
        if(root==NULL)
            return 0;
        
        //left
        int left=diameterOfBinaryTree(root->left);
        int right=diameterOfBinaryTree(root->right);
        //when we have to combine both trees
        int combine=ht(root->left)+ht(root->right);
        
        return max(combine,max(left,right));
    }
};