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
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null)
            return new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        
        Stack<TreeNode> st=new Stack();
        st.add(root);
        while(!st.isEmpty()){
            //pop top
            TreeNode top=st.pop();
            ans.add(top.val);
            //now first push right child then left for preorder bcz to process left child first
            
            if(top.right!=null)
                st.push(top.right);
            if(top.left!=null)
                st.push(top.left);
        }
        return ans;
    }
}