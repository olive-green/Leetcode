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
    void flatten(TreeNode* root) {
        // solution
        // 1. first flatten left and right subtree
        //2. store the tail pointers of left and right subtree
        // 3. store the right subtree in a temp var
        // 4. now make left subtree as right subtree and then join the left tail pointer with right subtree
        if(root==NULL ||(root->left==NULL && root->right==NULL)){
            return;
        }
        if(root->left!=NULL){
            //here we flatten the left subtree
            flatten(root->left);
            //now store right subtree into temp
            TreeNode* temp=root->right;
            //now make left subtree as right subtree
            root->right=root->left;
            //makes left as NULL
            root->left=NULL;
            
            //now join tree's tail pointer with right subtree
            //since we know we joined left subtree as right subtree and there is no left subtree
            TreeNode* t=root->right;
            while(t->right!=NULL)
                t=t->right;
            //now joins to right subtee
            t->right=temp;
            
        }
        //flatten the right subtree
        flatten(root->right);
    }
};