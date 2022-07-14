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
        Stack<TreeNode> st=new Stack<TreeNode>();
        List<Integer> ans=new ArrayList<>();
        TreeNode curr=root;
        while(curr!=null || st.size()>0){
            //reach the left most node of curr node
            while(curr!=null){
                st.push(curr);
                curr=curr.left;
            }
            //now pop the elements
            // * Current must be NULL at this point */
            TreeNode temp=st.pop();
            
            ans.add(temp.val);
            // we have visited the node and its
            //    left subtree.  Now, it's right
            //    subtree's turn 
            curr=temp.right;
        }
        return ans;
    }
}