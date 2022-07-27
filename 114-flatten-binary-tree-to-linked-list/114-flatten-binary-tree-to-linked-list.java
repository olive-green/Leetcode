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
    
    public void flatten(TreeNode root) {
        // 1.take temp-left and temp-right to store the left and right child.
        //     2.make node-left=null
        //     3.call flatter(temp-left) and flatten(temp-right)
        //     4.attach the left part to node's right
            // 5. traverse till the bottommost node in the attached part and attach the right to it.
        if(root==null)
            return;
        TreeNode temp_left=root.left;
        TreeNode temp_right=root.right;
        root.left=null;
        flatten(temp_left);
        flatten(temp_right);
        root.right=temp_left;
        TreeNode current_node=root;
        while(current_node.right!=null){
            current_node=current_node.right;
        }
        current_node.right=temp_right;
    }
}