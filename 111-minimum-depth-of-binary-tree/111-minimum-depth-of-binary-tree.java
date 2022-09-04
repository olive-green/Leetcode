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
     
    public int minDepth(TreeNode root) {
        // return solve(root);
        if(root==null)
            return 0;
        
        //left ht
        int leftHt=minDepth(root.left);
        int rightHt=minDepth(root.right);
        
        return (leftHt == 0 || rightHt == 0) ? leftHt + rightHt + 1: Math.min(leftHt,rightHt)+1;
    }
}