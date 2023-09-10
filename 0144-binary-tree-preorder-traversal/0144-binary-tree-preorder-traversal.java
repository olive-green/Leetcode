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
    public void solve(TreeNode root, List<Integer> ans){
        if(root==null)
            return;
        //add root in ans
        ans.add(root.val);
        //else first we traverse left subtree
        solve(root.left,ans);
        
        solve(root.right,ans);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        //first check if root is null or not
        List<Integer> ans=new ArrayList<>();
        solve(root,ans);
        
        return ans;
        
    }
}