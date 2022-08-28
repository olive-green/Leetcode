/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        //iterative approach
        if(root==null)
            return new ArrayList<>();
        
        Stack<TreeNode> st=new Stack<>();
       
        List<Integer> ans=new ArrayList<Integer>();
        
// 1) Create an empty stack S.
// 2) Initialize current node as root
// 3) Push the current node to S and set current = current->left until current is NULL
// 4) If current is NULL and stack is not empty then 
//      a) Pop the top item from stack.
//      b) Print the popped item, set current = popped_item->right 
//      c) Go to step 3.
// 5) If current is NULL and stack is empty then we are done. 
        while(root!=null || !st.isEmpty()){
            while(root!=null){
                st.push(root);
                root=root.left;
            }
            
            //here curr node is null
             root=st.pop();
            ans.add(root.val);
          // if(top.right!=null)
            root=root.right;
            
        }
        return ans;
    }
}