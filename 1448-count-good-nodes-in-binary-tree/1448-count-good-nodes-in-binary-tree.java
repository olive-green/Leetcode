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
//     public boolean helper(TreeNode root,TreeNode tar){
//         if(root==null){
//             return false;
//         }
//         if(root==tar){
//             return true;
//         }
//         if(root.val>tar.val)
//             return false;
//         boolean left=helper(root.left,tar);
//         if(left)
//             return true;
//         boolean right=helper(root.right,tar);
//         return right;
        
//     }
//     public int goodNodes(TreeNode root) {
//         if(root==null)
//             return 0;
//         Stack<TreeNode> st=new Stack<>();
//         st.push(root);
//         int ans=0;
//         while(!st.isEmpty()){
//             TreeNode curr=st.pop();
//             if(helper(root,curr)){
//                 ans++;
//             }
//             if(curr.right!=null){
//                 st.push(curr.right);
//             }
//             if(curr.left!=null){
//                 st.push(curr.left);
//             }
//         }
//         return ans;
        
//     }
    int good;
    public int goodNodes(TreeNode root) {
        good = 0;
        cal(root, Integer.MIN_VALUE);
        return good;
    }
    void cal(TreeNode root, int max){
        if(root == null) return;
        if(root.val >= max) good++;
        max = Math.max(max, root.val);
        cal(root.left, max);
        cal(root.right, max);
    }
    
}