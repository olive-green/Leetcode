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
    vector<vector<int>> zigzagLevelOrder(TreeNode* root) {
        vector<vector<int>> ans;
        if(root==NULL)
            return ans;
        
        queue<TreeNode*> q;
        q.push(root);
        bool flag=false;//false represents from left to right
        while(!q.empty()){
            int s=q.size();
            vector<int> temp;
            for(int i=0;i<s;i++){
                TreeNode* fnt=q.front();
                q.pop();
                // temp.push_back(fnt->val);
                
//                 if(flag!=true){
                    
                
//                 if(fnt->left!=NULL)
//                     q.push(fnt->left);
//                 if(fnt->right!=NULL)
//                     q.push(fnt->right);
                
//                 }
//                 else{
                   
//                 if(fnt->right!=NULL)
//                     q.push(fnt->right);
//                  if(fnt->left!=NULL)
//                     q.push(fnt->left);
//                 }
                //so if we follow the above approach ie. if true then insert right node first in queue and left node thereafter, we got wrong answer in level 2 if right node have child also 
                // ex- [1,2,3,4,5,6,7] gives wrong ans
                //to correct above approach we can make changes in inserting ele into vector
                //so when we are inserting ele into temp vector we check flag if its true 
                // then insert from beg in vector
                
                if(flag!=true)  temp.push_back(fnt->val);
                else temp.insert(temp.begin(),fnt->val);
                 if(fnt->left!=NULL)
                    q.push(fnt->left);
                if(fnt->right!=NULL)
                    q.push(fnt->right);
                
            }
            flag=!flag;

            //push the temp into ans
            ans.push_back(temp);
            
        }
        return ans;
    }
};