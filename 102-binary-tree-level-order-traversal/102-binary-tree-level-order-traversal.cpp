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
    vector<vector<int>> levelOrder(TreeNode* root) {
        vector<vector<int>> ans;
        if(root==NULL)
            return ans;
        
        queue<TreeNode*> q;
        q.push(root);
        while(!q.empty()){
            int s=q.size();
            vector<int> temp;
            for(int i=0;i<s;i++){
                TreeNode* fnt=q.front();
                q.pop();
                temp.push_back(fnt->val);
                //if left subtree is not empty then push the node in q
                if(fnt->left!=NULL)
                    q.push(fnt->left);
                if(fnt->right!=NULL)
                    q.push(fnt->right);
                
            }
            //push the temp into ans
            ans.push_back(temp);
            
        }
        return ans;
            
    }
};