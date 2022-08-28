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
    public List<Integer> postorderTraversal(TreeNode root) {
        //iterative approach
        if(root==null)
            return new ArrayList<>();
        Stack<TreeNode>st1=new Stack<>();
        Stack<TreeNode>st2=new Stack<>();
        List<Integer> ans=new ArrayList<>();
        st1.push(root);
        while(!st1.isEmpty()){
            //pop the top of st1
            TreeNode top=st1.pop();
            //pushes the top to st2
            st2.push(top);
            //pushes the left and right child of top to st1
            if(top.left!=null)
              st1.push(top.left);
            if(top.right!=null)
              st1.push(top.right);
            
        }
        //now our ans is content of stack 2
        while(!st2.isEmpty()){
            
            ans.add(st2.pop().val);
        }
        return ans;
    }
}